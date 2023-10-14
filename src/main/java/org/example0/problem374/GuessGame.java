package org.example0.problem374;

public class GuessGame {

    private final int data;

    public GuessGame(int data) {
        this.data = data;
    }

    public int guess(int value) {
        if (value == data) {
            return 0;
        }
        if (value < data) {
            return 1;
        }
        return -1;
    }
}
