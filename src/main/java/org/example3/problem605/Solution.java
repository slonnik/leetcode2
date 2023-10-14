package org.example3.problem605;

public class Solution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        if (flowerbed.length == 1) {
            return flowerbed[0] == 0;
        }
        boolean placed = false;
        for (int i = 0; i < flowerbed.length; ++i) {
            if (flowerbed[i] == 0) {
                if (i == 0) {
                    if(flowerbed[i + 1] == 0) {
                        placed = true;
                        flowerbed[i] = 1;
                        break;
                    }

                } else if (i == flowerbed.length - 1) {
                    if( flowerbed[flowerbed.length - 2] == 0) {
                        placed = true;
                        flowerbed[i] = 1;
                        break;
                    }

                } else if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    placed = true;
                    flowerbed[i] = 1;
                    break;
                }
            }
        }
        if (placed == false) {
            return false;
        }
        return canPlaceFlowers(flowerbed, n-1);
    }

}
