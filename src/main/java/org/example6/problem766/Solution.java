package org.example6.problem766;

public class Solution {

    public boolean isToeplitzMatrix(int[][] matrix) {
        if(matrix.length == 0) {
            return false;
        }
        //int lastRow = matrix.length -1;
        int width = matrix[0].length;
        for(int i=matrix.length -1; i >=0; i--) {
            for (int j = 0; j < width; ++j) {
                int row = i - 1;
                int column = j - 1;
                int value = matrix[i][j];
                while (row >= 0 && column >= 0) {
                    if (matrix[row][column] != value) {
                        return false;
                    }
                    row--;
                    column--;
                }
            }
        }
        return true;
    }
}
