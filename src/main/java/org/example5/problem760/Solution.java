package org.example5.problem760;

import java.util.HashMap;

public class Solution {

    public int[] anagramMappings(int[] nums1, int[] nums2) {
        var result = new int[nums1.length];
        var data = new HashMap<Integer, Integer>();
        for(int i=0; i < nums2.length; ++i) {
            data.put(nums2[i], i);
        }
        for(int i=0; i < nums1.length; ++i) {
             result[i] = data.get(nums1[i]);
        }
        return result;
    }
}
