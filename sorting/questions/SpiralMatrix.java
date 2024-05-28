package sorting.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SpiralMatrix {
    public static ArrayList<Integer> spiralMatrix(int[][] matrix){
        return printSpiralMatrix(matrix,0,new ArrayList<>());
    }

    public static ArrayList<Integer> printSpiralMatrix(int[][] matrix,int count,ArrayList<Integer> result){
        int top = count;
        int bottom = matrix.length - count - 1;
        int left = count;
        int right = matrix[0].length - count -1;
        if(top>bottom || left>right){
            return result;
        }
        int[] topRow = matrix[top];
        for(int i = left;i<=right;i++){
            result.add(topRow[i]);
        }
        for(int i = top+1;i<=bottom;i++){
            result.add(matrix[i][right]);
        }
        if(top!=bottom) {
            int[] bottomRow = matrix[bottom];
            for (int i = right - 1; i >= left; i--) {
                result.add(bottomRow[i]);
            }
        }
        if(left!=right) {
            for (int i = bottom - 1; i > top; i--) {
                result.add(matrix[i][left]);
            }
        }
        return printSpiralMatrix(matrix,count+1,result);
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralMatrix(arr).toString());
    }
}
