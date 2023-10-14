package org.example0.problem374;

public class Solution extends GuessGame{

    public Solution(int data) {
        super(data);
    }

    public int guessNumber(int value) {
        return _internalGuess(0, Integer.MAX_VALUE, value);
    }

    private int _internalGuess(long lower, long upper, int value) {

        if(upper - lower < 100) {
            while(lower <=upper) {
                if(guess((int)lower)==0) {
                    return (int)lower;
                }
                lower++;
            }
        }

        var middle = (int)((upper + lower) / 2);
        if(guess(middle) == 0) {
            return middle;
        }
        if(guess(middle)  < 0) {
            return _internalGuess(lower, middle, value);
        }
        return _internalGuess(middle, upper, value);
    }


}
