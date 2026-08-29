package main.java.core;

public class Rook extends Piece {
    public char getSymbol() {
        return 'R';
    }

    public boolean isValidMove(String move) {
        return true;
    }
}
