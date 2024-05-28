package sorting;

import java.util.Arrays;

public class InsertionSort {
    static void insertionSort(int[] n){
        for(int i = 1;i<n.length;i++){
            for(int j = i;j>0 && n[j-1]>n[j];j--){
                swap(n,j-1,j);
            }
        }
    }
    static void swap(int[] n,int a,int b){
        int temp = n[a];
        n[a] = n[b];
        n[b] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {23,12,40,20,21,67};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
