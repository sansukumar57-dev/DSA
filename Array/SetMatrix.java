package DSA.Array;

import java.util.*;

class SetMatrix {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        Set<Integer> row=new HashSet<>();
        Set<Integer> col=new HashSet<>();
        

       
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

     
        for (int r : rows) {
            for (int j = 0; j < n; j++) {
                matrix[r][j] = 0;
            }
        }

       
        for (int c : cols) {
            for (int i = 0; i < m; i++) {
                matrix[i][c] = 0;
            }
        }
    }
}