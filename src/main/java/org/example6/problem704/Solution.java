package org.example6.problem704;

public class Solution {

    public int search(int[] nums, int target) {
        return _internal(0, nums.length - 1, nums, target);
    }


    int _internal(int start, int end, int[] nums, int val) {
        if (start > end) {
            return -1;
        }
        if (start == end) {
            if (nums[start] == val) {
                return start;
            }
            return -1;
        }
        if (end - start == 1) {
            if (nums[end] == val) {
                return end;
            }
            if (nums[start] == val) {
                return start;
            }
            return -1;
        }
        var mid = (start + end) / 2;
        if (nums[mid] == val) {
            return mid;
        }
        if (nums[mid] < val) {
            return _internal(mid + 1, end, nums, val);
        } else {
            return _internal(start, mid - 1, nums, val);
        }
    }
}
