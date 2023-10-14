package org.example0.problem367;

public class Solution {

    public boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }
        if (num == 0) {
            return true;
        }
        long upper = 1;
        long lower = 1;
        while (true) {
            var result = upper * upper;
            if (result == num) {
                return true;
            }
            if (result > num) {
                break;
            }
            lower = upper;
            upper *= 2;
        }

        return iterate(lower, upper, num);
    }

    private boolean iterate(long lower, long upper, int num) {
        if (upper - lower < 100) {
            while (upper >= lower) {
                if (upper * upper == num) {
                    return true;
                }
                upper--;
            }
            return false;
        }
        var middle = (upper + lower) / 2;
        if (middle * middle == num) {
            return true;
        }
        if (middle * middle > num) {
            return iterate(lower, middle, num);
        } else {
            return iterate(middle, upper, num);
        }
    }

}
