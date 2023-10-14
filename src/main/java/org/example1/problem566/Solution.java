package org.example1.problem566;


class Solution {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] result = new int[r][c];
        int rowNum = mat.length;
        int colNum = mat[0].length;
        if (r * c != rowNum * colNum) {
            return mat;
        }
        int resultRow = 0;
        int resultColumn = 0;
        for (int i = 0; i < rowNum; ++i) {
            for (int j = 0; j < colNum; ++j) {
                result[resultRow][resultColumn] = mat[i][j];
                resultColumn++;
                if (resultColumn == c) {
                    resultRow++;
                    resultColumn = 0;
                }
            }
        }
        return result;
    }
}

