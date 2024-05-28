package sorting.questions;

import java.util.Arrays;

public class SortArrayOfZerosOnesAndTwos {
    static void sort(int[] num){
        if(num.length == 1){
            return;
        }
        int i = 0;
        int j = num.length-1;
        int currentPositionAfterZero = 0;
        while(i<=j){
            if(num[i]==0){
                if(i!=currentPositionAfterZero) {
                    swap(num, i, currentPositionAfterZero);
                }
                i++;
                currentPositionAfterZero++;
            } else if (num[i] == 2) {
                if(i!=j) {
                    swap(num, i, j);
                }
                j--;
            } else{
                i++;
            }
        }
    }

    private static void swap(int[] n, int i, int j) {
        n[i] = n[i]+ n[j];
        n[j] = n[i] - n[j];
        n[i] = n[i]- n[j];
    }

    public static void main(String[] args) {
        int[] n = {2,2};
        sort(n);
        System.out.println(Arrays.toString(n));
    }
}
