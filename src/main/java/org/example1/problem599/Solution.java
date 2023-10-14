package org.example1.problem599;

import java.util.HashMap;
import java.util.LinkedList;

public class Solution {

    public String[] findRestaurant(String[] list1, String[] list2) {
        var dataTwo = new HashMap<String, Integer>();
        var dataDiff = new HashMap<String, Integer>();
        for (int i = 0; i < list2.length; ++i) {
            dataTwo.put(list2[i], i);
        }

        for(int i=0; i < list1.length; ++i) {
            var item = list1[i];
            if(dataTwo.containsKey(item)) {
                var pos = dataTwo.get(item);
                dataDiff.put(item, Math.abs(pos + i));
            }
        }

        int minLength = Integer.MAX_VALUE;
        for(int length : dataDiff.values()) {
            if(length < minLength) {
                minLength = length;
            }
        }

        var result = new LinkedList<String>();
        for(var entry : dataDiff.entrySet()) {
            if(entry.getValue() == minLength) {
                result.add(entry.getKey());
            }
        }

        return result.toArray(new String[]{});
    }
}
