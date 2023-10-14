package org.example0.problem383;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        var cache = new HashMap<Character, AtomicInteger>();
        for (int i = 0; i < magazine.length(); ++i) {
            Character symbol = magazine.charAt(i);
            if(!cache.containsKey(symbol)) {
                cache.put(symbol, new AtomicInteger(1));
            } else {
                cache.get(symbol).incrementAndGet();
            }
        }

        for (int i = 0; i < ransomNote.length(); ++i) {
            Character symbol = ransomNote.charAt(i);
            if(!cache.containsKey(symbol)) {
                return false;
            } else {
                var value = cache.get(symbol).decrementAndGet();
                if(value == 0) {
                    cache.remove(symbol);
                }
            }
        }
        return true;
    }
}
