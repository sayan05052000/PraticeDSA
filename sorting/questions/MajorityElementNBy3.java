package sorting.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementNBy3 {
    public static List<Integer> findMajorityElementNBy3BruteForce(int[] arr) {
        int minRequiredNumber = arr.length / 3 + 1;
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == minRequiredNumber) {
                ls.add(arr[i]);
            }
            if (ls.size() == 2) {
                return ls;
            }
        }
        return ls;
    }

    public static List<Integer> findMajorityElementNBy3Better(int[] arr) {
        int minRequiredNumber = arr.length / 3 + 1;
        List<Integer> ls = new ArrayList<>();
        Map<Integer, Integer> mp = new HashMap<>();
        for (int j : arr) {
            int currentCount = mp.getOrDefault(j, 0);
            int count = currentCount + 1;
            if (currentCount < minRequiredNumber) {
                mp.put(j, count);
                if (count >= minRequiredNumber) {
                    ls.add(j);
                    if (ls.size() == 2) {
                        return ls;
                    }
                }
            }
        }
        return ls;
    }

    public static List<Integer> findMajorityElementNBy3Optimized(int[] arr) {
        int minRequiredNumber = arr.length / 3 + 1;
        int count1 = 0, count2 = 0, el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
        List<Integer> ls = new ArrayList<>();
        for (int i : arr) {
            if (count1 == 0 && i != el2) {
                count1++;
                el1 = i;
            } else if (count2 == 0 && i != el1) {
                count2++;
                el2 = i;
            } else if (i == el1) {
                count1++;
            } else if (i == el2) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int i:arr){
            if(i == el1){
                count1++;
            }
            if(count1==minRequiredNumber){
                ls.add(el1);
                break;
            }
        }
        for(int i:arr){
            if(i == el2){
                count2++;
            }
            if(count2==minRequiredNumber){
                ls.add(el2);
                break;
            }
        }
        return ls;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,1,1,3,3,3,3};
        System.out.println(findMajorityElementNBy3BruteForce(arr));
        System.out.println(findMajorityElementNBy3Better(arr));
        System.out.println(findMajorityElementNBy3Optimized(arr));
    }
}
