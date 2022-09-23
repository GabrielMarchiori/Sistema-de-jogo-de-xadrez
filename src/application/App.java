package application;

import chess.ChessMath;


public class App {
    public static void main(String[] args) throws Exception {

        ChessMath chessMath = new ChessMath();

        UI.printBoard(chessMath.getPieces());


    }
}
