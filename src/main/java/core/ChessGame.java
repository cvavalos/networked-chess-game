package main.java.core;

public class ChessGame {
    Piece[][] chessBoard = new Piece[8][8];

    public void initializeBoard() {
        chessBoard[0][0] = new Rook();
        chessBoard[0][1] = new Knight();
        chessBoard[0][2] = new Bishop();
        chessBoard[0][3] = new Queen();
        chessBoard[0][4] = new King();
        chessBoard[0][5] = new Bishop();
        chessBoard[0][6] = new Knight();
        chessBoard[0][7] = new Rook();

        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 8; j++) {
                chessBoard[i][j] = new Pawn();
            }
        }

        for (int i = 6; i < 7; i++) {
            for (int j = 0; j < 8; j++) {
                chessBoard[i][j] = new Pawn();
            }
        }

        chessBoard[7][0] = new Rook();
        chessBoard[7][1] = new Knight();
        chessBoard[7][2] = new Bishop();
        chessBoard[7][3] = new Queen();
        chessBoard[7][4] = new King();
        chessBoard[7][5] = new Bishop();
        chessBoard[7][6] = new Knight();
        chessBoard[7][7] = new Rook();
    }

    public void printBoard() {
        System.out.println("----------------");
        for (int i = 0; i < 8; i++) {
            System.out.print((8 - i) + "|");
            for (int j = 0; j < 8; j++) {
                if (chessBoard[i][j] == null) {
                    System.out.print("|_");
                }
                else {
                    System.out.print("|" + chessBoard[i]][j].getSymbol());
                }
            }
            System.out.println();
        }
        System.out.println("----------------");
        System.out.println("a b c d e f g h");
    }

    public boolean makeMove(int[] start, int[] end) {

        return true;
    }

    public boolean checkCheck() {
        return true;
    }

    public boolean checkCheckmate() {
        return true;
    }

    public boolean checkWin() {
        return true;
    }
}
