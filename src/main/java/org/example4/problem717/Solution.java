package org.example4.problem717;

public class Solution {

    public boolean isOneBitCharacter(int[] bits) {
        int index = 0;
        while(index < bits.length) {
            if(bits[index] == 0) {
                if(index == bits.length -1) {
                    return true;
                }
                index++;
            }else {
                index +=2;
            }
        }
        return false;
    }
}
