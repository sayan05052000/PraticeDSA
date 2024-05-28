package sorting;

import java.util.Arrays;

public class MergeSort {
    static void mergeSort(int[] n,int start,int end){
        if(start<end){
            int mid = (start+end)/2;
            mergeSort(n,start,mid);
            mergeSort(n,mid+1,end);
            merge(n,start,mid,end);
        }
    }

    private static void merge(int[] n, int start, int mid, int end) {
        int i = start;
        int j = mid+1;
        int[] newArr = new int[(end-start)+1];
        int k = 0;
        while(i<=mid && j<=end){
            if(n[i]<n[j]){
                newArr[k++] = n[i++];
            }else{
                newArr[k++] = n[j++];
            }
        }
        while(i<=mid){
            newArr[k++] = n[i++];
        }
        while(j<=end){
            newArr[k++] = n[j++];
        }
        int l = 0;
        for(int m=start;m<=end;m++){
            n[m] = newArr[l++];
        }
    }
    public static void main(String[] args) {
        int[] arr = {23,12,40,20,21,67};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
