package org.example0.problem389;

public class Solution {
    public char findTheDifference(String s, String t) {
        int[] cacheS = new int[26];
        int[] cacheT = new int[26];
        int i = 0;
        for (i = 0; i < s.length(); ++i) {
            char symbolS = s.charAt(i);
            char symbolT = t.charAt(i);
            cacheS[symbolS - 'a'] = cacheS[symbolS - 'a'] + 1;
            cacheT[symbolT - 'a'] = cacheT[symbolT - 'a'] + 1;
        }
        char symbolT = t.charAt(i);
        cacheT[symbolT - 'a'] = cacheT[symbolT - 'a'] + 1;
        for (i = 0; i < cacheS.length; ++i) {
            if(cacheS[i] != cacheT[i]) {
                return (char)(i + 'a');
            }
        }
        return 'a';
    }
}
