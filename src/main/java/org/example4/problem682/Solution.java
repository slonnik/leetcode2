package org.example4.problem682;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {

    public int calPoints(String[] operations) {
        Deque<Integer> data = new LinkedList<>();
        for (var operation : operations) {
            switch (operation) {
                case "+": {
                    var valOne = data.pollLast();
                    var valTwo = data.peekLast();
                    data.offerLast(valOne);
                    data.offerLast(valOne + valTwo);
                    break;
                }
                case "D": {
                    var valOne = data.peekLast();
                    data.offerLast(2 * valOne);
                    break;
                }

                case "C": {
                    data.pollLast();
                    break;
                }

                default: {
                    data.offerLast(Integer.parseInt(operation));
                }
            }
        }

        return data.stream().reduce(0, Integer::sum);
    }
}
