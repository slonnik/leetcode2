package org.example6.problem703;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargest {

    PriorityQueue data = new PriorityQueue();

    private final int length;

    public KthLargest(int k, int[] nums) {
        length = k;
        Arrays.sort(nums);
        for (int i = 1; i <= length; ++i) {
            var position = nums.length - i;
            if (position < 0) {
                break;
            }
            data.add(nums[position]);
        }
    }

    public int add(int val) {
        data.add(val);
        while(data.size() > length) {
           data.poll();
        }
        return (Integer) data.peek();
    }
}
