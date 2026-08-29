package main.java.core;

public class Queen extends Piece {
    public char getSymbol() {
        return 'Q';
    }

    public boolean isValidMove(String move) {
        return true;
    }
}
