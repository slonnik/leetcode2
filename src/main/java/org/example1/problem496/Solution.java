package org.example1.problem496;

import java.util.LinkedList;

public class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // find max length
        int maxLength = 0;
        for (int i = 0; i < nums2.length; ++i) {
            if (nums2[i] > maxLength) {
                maxLength = nums2[i];
            }
        }
        maxLength++;
        // define data cache
        int[] data = new int[maxLength];
        for (int i = 0; i < data.length; ++i) {
            data[i] = -1;
        }
        for (int i = 0; i < nums2.length; ++i) {
            int pos = nums2[i];
            data[pos] = i;
        }

        // iterate through subset
        var result = new int[nums1.length];
        for (int i = 0; i < nums1.length; ++i) {
            int value = nums1[i];
            int startPos = value + 1;
            int curValue = data[value];
            int resultValue = Integer.MAX_VALUE;
            if (startPos < data.length) {
                for (int j = startPos; j < data.length; ++j) {
                    if (curValue < data[j] && resultValue >= data[j]) {
                        resultValue = data[j];
                    }
                }
            }
            result[i] = (resultValue == Integer.MAX_VALUE) ? -1 : nums2[resultValue];
        }
        return result;
    }
}
