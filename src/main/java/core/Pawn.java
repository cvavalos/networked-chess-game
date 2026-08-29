package main.java.core;

public class Pawn extends Piece {
    private boolean isFirstMove = true;

    public char getSymbol() {
        return 'p';
    }

    public boolean isValidMove(int[] start, int[] end) {
        if (isFirstMove) {

            isFirstMove = false;
        }
        else {

        }
        return true;
    }
}
