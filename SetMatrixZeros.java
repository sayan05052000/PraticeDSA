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

    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
    }
}
