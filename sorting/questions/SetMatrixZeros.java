package sorting.questions;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeros {
    public static void setZeroes(int[][] matrix) {
        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> columnSet = new HashSet<>();
        int sizeAcrossRow = matrix.length;
        int sizeAcrossCoulumn = 0;
        if (matrix.length != 0) {
            sizeAcrossCoulumn = matrix[0].length;
        }
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < row.length; j++) {
                if (row[j] == 0) {
                    rowSet.add(i);
                    columnSet.add(j);
                }
            }
        }
        for (int i : rowSet) {
            for (int j = 0; j < sizeAcrossCoulumn; j++) {
                matrix[i][j] = 0;
            }
        }
        for (int j : columnSet) {
            for (int i = 0; i < sizeAcrossRow; i++) {
                matrix[i][j] = 0;
            }
        }
    }

    /***
     * The idea is to take the first row the column marker and the first column as the row marker
     * But the issue is the position (0,0) works both as a column marker and a row marker
     * sum fix this issue to mark column 0 we will take a separate variable col0
     * @param matrix
     */
    public static void setZeroesOptimal(int[][] matrix) {
        int col0 = 1;
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < row.length; j++) {
                if (row[j] == 0) {
                    if (j == 0) {
                        col0 = 0;
                    } else {
                        matrix[0][j] = 0;
                    }
                    matrix[i][0] = 0;
                }
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            int[] row = matrix[i];
            for (int j = 1; j < row.length; j++) {
                    if (matrix[0][j] == 0 || matrix[i][0] == 0){
                        matrix[i][j] =0;
                    }
            }
        }
        for(int i = 0;i<matrix.length;i++){
            if(i==0) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (j == 0) {
                        if (col0 == 0 || matrix[i][0] == 0) {
                            matrix[i][j] = 0;
                        }
                    } else {
                        if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                            matrix[i][j] = 0;
                        }
                    }
                }
            }else{
                if (col0 == 0 || matrix[i][0] == 0) {
                    matrix[i][0] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 1,1}, {1, 0, 1,0}, {1, 1, 1,1}};
        setZeroesOptimal(matrix);
    }
}
