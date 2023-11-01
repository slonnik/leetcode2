package org.example6.problem812;

public class Solution {

    public double largestTriangleArea(int[][] points) {
        double minX = Integer.MAX_VALUE;
        double maxX = Integer.MIN_VALUE;
        double minY = Integer.MAX_VALUE;
        double maxY = Integer.MIN_VALUE;
        for(int i=0; i < points.length; ++i) {
            minX = Math.min(minX, points[i][0]);
            maxX = Math.max(maxX, points[i][0]);
            minY = Math.min(minY, points[i][1]);
            maxY = Math.max(maxY, points[i][1]);

        }
        return Math.abs(((maxX-minX)*(maxY-minY))/2);
    }
}
