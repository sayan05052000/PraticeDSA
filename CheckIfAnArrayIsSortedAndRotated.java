package sorting.questions;

import java.util.Scanner;

public class CheckIfAnArrayIsSortedAndRotated {
    static boolean check(int[] nums){
        if (nums.length<=2){
            return true;
        }
        int i = 0;
        while(i<nums.length-1 && nums[i]<=nums[i+1]){
            i++;
        }
        int j = i;
        if(j!=nums.length-1 && nums[0]<nums[nums.length-1]){
            return false;
        }
        i = i+1;
        while(i<nums.length-1){
            if (nums[i]>nums[i+1]){
                return  false;
            }
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            System.out.println("Please enter the "+(i+1)+"th element of the array");
            arr[i] = sc.nextInt();
        }
        System.out.println(check(arr));
    }
}
