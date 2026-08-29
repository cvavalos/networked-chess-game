package main.java.core;

public class Knight extends Piece {
    public char getSymbol() {
        return 'k';
    }

    public boolean isValidMove(String move) {
        return true;
    }
}
