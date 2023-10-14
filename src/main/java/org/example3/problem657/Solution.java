package org.example3.problem657;

public class Solution {

    public boolean judgeCircle(String moves) {
        var data = new int[2];
        for(int i=0; i< moves.length(); ++i) {
            switch (moves.charAt(i)) {
                case 'U': {
                    data[1] += 1;
                    break;
                }
                case 'D': {
                    data[1] -= 1;
                    break;
                }
                case 'R': {
                    data[0] += 1;
                    break;
                }
                case 'L': {
                    data[0] -= 1;
                    break;
                }
            }
        }
        return data[0] == 0 && data[1] == 0;
    }
}
