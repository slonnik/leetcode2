package org.example4.problem661;

public class Solution {

    public int[][] imageSmoother(int[][] img) {
        var rows = img.length;
        var columns = img[0].length;

        var result = new int[rows][columns];
        for(int i=0; i< rows; ++ i) {
            for(int j=0; j < columns; ++j) {
                var sum =0;
                int counter = 0;
                var startRow = i -1;
                var startColumn = j -1;
                var endRow = i+2;
                var endColumn = j +2;
                for(int k = startRow; k< endRow; ++k) {
                    for (int l = startColumn; l < endColumn; ++l) {
                        if(k < 0 || l < 0 || k >= rows || l >=columns) {
                            continue;
                        }
                        sum += img[k][l];
                        counter++;
                    }
                }
                result[i][j] = (int)Math.floor((double)sum/counter);

            }

        }
        return result;
    }
}
