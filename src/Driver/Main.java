package Driver;

import Model.ChessBoard;
import Model.Piece.Piece;
import Model.Spot;
import Util.InputReader;

public class Main {
    public static void main(String[] args) throws Exception {

        InputReader inputReader = new InputReader();
        ChessBoard chessBoard = new ChessBoard();
        
        // init chess board with given txt file & show results.
        chessBoard.initBoard(inputReader.reader());
        
    }
}
