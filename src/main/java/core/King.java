package main.java.core;

public class King extends Piece {
    public char getSymbol() {
        return 'K';
    }

    public boolean isValidMove(String move) {
        return true;
    }
}
