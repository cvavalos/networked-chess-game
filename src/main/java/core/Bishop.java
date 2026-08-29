package main.java.core;

public class Bishop extends Piece {
    public char getSymbol() {
        return 'B';
    }

    public boolean isValidMove(String move) {
        return true;
    }
}
