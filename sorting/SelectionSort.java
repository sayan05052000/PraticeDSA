package sorting;

import java.util.Arrays;

public class SelectionSort {
    static int[] selectionSort(int[] n){
        for(int i = 0;i<n.length;i++){
            int minIndex = findMinimumIndex(n,i, n.length-1);
            swap(n,i,minIndex);
        }
        return  n;
    }

    static int findMinimumIndex(int[] n,int start,int end){
        int min = start;
        for(int i =start;i<=end;i++){
            min = n[min]<=n[i]?min:i;
        }
        return min;
    }

    static void swap(int[] n,int a,int b){
        int temp = n[a];
        n[a] = n[b];
        n[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {20,23,40,67,21,12};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
