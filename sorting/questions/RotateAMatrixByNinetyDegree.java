package sorting.questions;

import java.util.Arrays;

public class RotateAMatrixByNinetyDegree {

    /***
     * How ever this is a bruteforce solution
     * @param matrix
     * @return
     */
    public static int[][] rotateAMatrixByNinetyDegree(int[][] matrix){
        int sizeAcrossRow = matrix.length;
        int sizeAcrossColumn = 0;
        if(matrix.length!=0) sizeAcrossColumn = matrix[0].length;
        int[][] newMatrix = new int[sizeAcrossColumn][sizeAcrossRow];
        for(int i =0 ;i<sizeAcrossRow;i++){
            for(int j = 0;j<sizeAcrossColumn;j++){
                newMatrix[j][sizeAcrossRow-1-i] = matrix[i][j];
            }
        }
        return newMatrix;
    }

    /***
     * This is the optimal solution the idea is we will make the matrix in transpose then will reverse each row
     * @param matrix
     */
    public static void rotateAMatrixByNinetyDegreeOptimal(int[][] matrix){
        transpose(matrix);
        for (int[] i:matrix){
            reverseArray(i);
        }
    }

    /***
     *
     * @param matrix
     */
    public static void transpose(int[][] matrix){
        for(int i = 0;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                swap(matrix,i,j);
            }
        }
    }

    /***
     *
     * @param n
     */
    public static void reverseArray(int[] n){
        int i = 0;
        int j = n.length-1;
        while (i<j){
            swap(n,i++,j--);
        }
    }

    /***
     *
     * @param matrix
     * @param i
     * @param j
     */
    public static void swap(int[][] matrix,int i,int j ){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    public static void swap(int[] n,int i,int j ){
        int temp = n[j];
        n[j] = n[i];
        n[i] = temp;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,0,2},{2,3,5},{5,6,7}};
        rotateAMatrixByNinetyDegreeOptimal(matrix);
        System.out.println(Arrays.toString(matrix));
    }
}
