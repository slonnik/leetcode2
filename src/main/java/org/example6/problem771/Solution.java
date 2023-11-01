package org.example6.problem771;

import java.util.HashSet;

public class Solution {

    public int numJewelsInStones(String jewels, String stones) {
        var data = new HashSet<Character>();
        for(int i=0; i < jewels.length(); ++i) {
            data.add(jewels.charAt(i));
        }
        int count =0;
        for(int i=0; i < stones.length(); ++i) {
            if(data.contains(stones.charAt(i))) {
                count++;
            }
        }

        return count;
    }
}
