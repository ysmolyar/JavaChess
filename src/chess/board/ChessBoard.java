package chess.board;

/**
 * Class representing a ChessBoard comprised of Cells.
 */
public class ChessBoard {
    private final int boardWidth = 8;
    private final int boardHeight = 8;
    private Cell[][] grid = new Cell[boardHeight][boardWidth];

    public ChessBoard() {
        this.initGrid();
    }

    private void initGrid() {
        for (int row = 0; row < boardHeight; row++) {
            for (int col = 0; col < boardWidth; col++) {
                grid[row][col] = new Cell(row, col);
            }
        }
    }

}
