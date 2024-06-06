package sorting.questions;

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> findThreeSumBruteForce(int[] nums) {
        Set<List<Integer>> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> ls = new ArrayList<>();
                        ls.add(nums[i]);
                        ls.add(nums[j]);
                        ls.add(nums[k]);
                        ls.sort(Comparator.naturalOrder());
                        hashSet.add(ls);
                    }
                }
            }
        }
        return new ArrayList<>(hashSet);
    }

    public static List<List<Integer>> findThreeSumBetter(int[] nums) {
        Set<List<Integer>> hashSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            Set<Integer> counterSet = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (counterSet.contains(-sum)) {
                    List<Integer> ls = new ArrayList<>();
                    ls.add(nums[i]);
                    ls.add(nums[j]);
                    ls.add(-sum);
                    ls.sort(Comparator.naturalOrder());
                    hashSet.add(ls);
                }
                counterSet.add(nums[j]);
            }
        }
        return new ArrayList<>(hashSet);
    }

    public static List<List<Integer>> findThreeSumOptimal(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length - 1) {
            int current = nums[i];
            int j = i + 1;
            int k = nums.length - 1;
            int sum = nums[i] + nums[j] + nums[k];
            while (j < k) {
                int currentJValue = nums[j];
                int currentKValue = nums[k];
                if (sum > 0) {
                    k--;

                } else if (sum < 0) {
                    j++;

                } else {
                    while (j < nums.length && currentJValue == nums[j]) {
                        j++;
                    }
                    while (k >= 0 && currentKValue == nums[k]) {
                        k--;
                    }
                    List<Integer> ls1 = new ArrayList<>();
                    ls1.add(current);
                    ls1.add(currentJValue);
                    ls1.add(currentKValue);
                    list.add(ls1);
                }
                if (j >= nums.length||k < 0 )
                    break;
                sum = nums[i] + nums[j] + nums[k];
            }

            while (i < nums.length && current == nums[i]) {
                i++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        //-1,-1,0,1,2,4
        int[] nums = {-1,4,2,-1,0,1 };
        // System.out.println(findThreeSumBruteForce(nums));
        System.out.println(">>>>>Better");
        System.out.println(findThreeSumBetter(nums));
        System.out.println(">>>>>Optimal");
        System.out.println(findThreeSumOptimal(nums));
    }
}