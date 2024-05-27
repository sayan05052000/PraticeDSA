package sorting.questions;

import java.util.Arrays;

public class ReArrangeArray {
    public static int[] rearrangeArray(int[] nums) {
        int currentPositiveCounter = 0;
        int currentNegativeCounter = 1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>0){
                if(i%2!=0) {
                    swap(nums, i, currentPositiveCounter);
                }
                currentPositiveCounter += 2;
            }
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<0){
                if(i%2==0) {
                    swap(nums, i, currentNegativeCounter);
                }
                currentNegativeCounter += 2;
            }
        }
        return nums;
    }

    public static void swap(int[] num,int i,int j){
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

    public static void main(String[] args) {
        int[] n = {-1,2,1,3,-2,-6};
        int[] n1 = rearrangeArray(n);
        System.out.println(Arrays.toString(n1));

    }
}
