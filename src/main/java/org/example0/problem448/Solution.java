package org.example0.problem448;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        final int length = nums.length;
        byte[] data = new byte[length + 1];
        for(int value : nums) {
            data[value] = 1;
        }
        var result = new LinkedList<Integer>();
        for(int i=1; i<=length; ++i) {
            if(data[i] == 0) {
                result.add(i);
            }
        }
        return result;
    }
}
