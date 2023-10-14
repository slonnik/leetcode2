package org.example1.problem604;

import java.util.Deque;
import java.util.LinkedList;

public class StringIterator {

    final String data;

    int curPos = 0;

    int[] symbolPos;
    int[] symbolCount;


    public StringIterator(String compressedString) {
        this.data = compressedString;
        var count = 0;
        for (int i = 0; i < this.data.length(); ++i) {
            if (!Character.isDigit(this.data.charAt(i))) {
                count++;
            }
        }
        int index = 1;
        Deque<Integer> deque = new LinkedList<Integer>();
        this.symbolPos = new int[count];
        this.symbolCount = new int[count];
        for (int i = 1; i < this.data.length(); ++i) {
            var symbol = this.data.charAt(i);
            if (!Character.isDigit(symbol)) {
                symbolPos[index] = i;
                symbolCount[index - 1] = calculateLength(deque);
                index++;
            } else {
                deque.addLast(symbol - '0');
            }
        }

        symbolCount[index - 1] = calculateLength(deque);
    }

    private int calculateLength(Deque<Integer> data) {
        int length =0;
        int multiplication = 1;
        while(!data.isEmpty()) {
            length += data.pollLast() * multiplication;
            multiplication *= 10;
        }
        return length;
    }

    public char next() {
        if(!hasNext()) {
            return ' ';
        }
        var symbol = data.charAt(symbolPos[curPos]);
        symbolCount[curPos] -= 1;
        if(symbolCount[curPos] < 1) {
            curPos++;
        }
        return symbol;
    }

    public boolean hasNext() {
        return curPos < symbolPos.length;
    }
}
