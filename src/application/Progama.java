package application;

import boardGame.Board;
import boardGame.Position;
import chess.ChessMate;

public class Progama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		ChessMate chessMate = new ChessMate();
		UI.printBoard(chessMate.getPieces());
	

	}

}
