package sorting.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountSubArrayWithSumK {
    public static int findCountSubArrayWithSumKBruteForce(int[] n, int k) {
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            int sum = 0;
            for (int j = i; j < n.length; j++) {
                sum += n[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int findCountSubArrayWithSumKOptimal(int[] nums, int k) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k) {
                count++;
            }
            if (map.containsKey(sum - k))
                count += map.get(sum - k).size();
            ArrayList<Integer> newArrayList = map.getOrDefault(sum, new ArrayList<>());
            newArrayList.add(i);
            map.put(sum, newArrayList);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] n = {1, 2, 3};
        System.out.println(findCountSubArrayWithSumKBruteForce(n, 3));
        System.out.println(findCountSubArrayWithSumKOptimal(n, 3));
    }
}
