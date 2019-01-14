package chess.model.board;

import chess.model.pieces.Piece;

/**
 * Class representing one cell of a ChessBoard.
 */
public class Cell {
    private int row;
    private int col;
    private Piece occupant;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.occupant = null;

    }

    public Piece getOccupant() {
        return occupant;
    }

    public void setOccupant(Piece newPiece) {
        this.occupant = newPiece;
    }

    public boolean isEmpty() {
        return this.occupant == null;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

}
