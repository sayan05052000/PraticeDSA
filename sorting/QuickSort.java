package sorting;

import java.util.Arrays;

public class QuickSort {
    static void quickSort(int[] n,int low,int high){
        if (low<high){
            int pivotIndex = sort(n,low,high);
            quickSort(n,low,pivotIndex-1);
            quickSort(n,pivotIndex+1,high);
        }
    }

    private static int sort(int[] n, int low, int high) {
        int i = low;
        int j = high;
        while(i<j){
            while(i<=high && n[i]<=n[low]){
                i++;
            }
             while(j>=low && n[j]>n[low] ){
                 j--;
             }
             if(i<j) {
                 swap(n, i, j);
             }else{
                 swap(n,i-1, low);
             }
        }

        return i-1;
    }
    static void swap(int[] n,int a,int b){
        int temp = n[a];
        n[a] = n[b];
        n[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {12,20,21,23,40,67};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

