package main.java.core;

public abstract class Piece {
    public abstract char getSymbol();
    public abstract boolean isValidMove(int[] start, int[] end);
}
