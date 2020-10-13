package chess;

import boardGame.Board;
import boardGame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMate {

	private Board board;
	
	
	
	public ChessMate() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void placeNewPiece( char column,int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	private void initialSetup() {
		
		board.placePiece(new Rook(Color.WHITE, board), new Position(2, 1));
		board.placePiece(new King(Color.WHITE, board), new Position(3, 1));
	}
	

	

}
