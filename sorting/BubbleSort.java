package sorting;

import java.util.Arrays;

public class BubbleSort {

    static int[] bubbleSort(int[] n){

        for(int i = n.length-1;i>=1;i--){
            boolean swapped = false;
            int k = 1;
            int j = 0;
            while(j<=i-1 && k<=i){
                if(n[k]<n[j]){
                    swap(n,j,k);
                    swapped = true;
                }
                j++;k++;
            }
            if (!swapped){
                break;
            }
        }
        return n;
    }
    static void swap(int[] n,int a,int b){
        int temp = n[a];
        n[a] = n[b];
        n[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {12,20,21,23,40,67};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
