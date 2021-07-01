package Model;

import Model.Piece.*;
import Util.CalculateScore;
import Util.InputReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ChessBoard {
    private ArrayList<Spot> spotList = new ArrayList<>();


    public void initBoard(List<String> currentBoard)
    {
        Spot spotObj = null;
        CalculateScore calculateScore = new CalculateScore();



        for(int i = 0; i < currentBoard.size(); i++) {
            //System.out.println(i);

            //check input type and color to arrange chess board according to given txt file.
            char pieceType = currentBoard.get(i).charAt(0);
            char pieceColor = currentBoard.get(i).charAt(1);

            //add pieces to spots with type, x and y coordinates.
            if (pieceType != 'x') {
                switch (pieceType){
                    case 'f':
                        spotObj = new Spot(i%8,-i/8, new Bishop());
                        break;
                    case 'k':
                        spotObj = new Spot(i%8,-i/8, new Rook());
                        break;
                    case 'a':
                        spotObj = new Spot(i%8,-i/8, new Knight());
                        break;
                    case 's':
                        spotObj = new Spot(i%8,-i/8, new King());
                        break;
                    case 'v':
                        spotObj = new Spot(i%8,-i/8, new Queen());
                        break;
                    case 'p':
                        spotObj = new Spot(i%8,-i/8, new Pawn());
                        break;
                }
                if (pieceColor == 'b') {
                    spotObj.getPiece().setWhite(true);
                }else{
                    spotObj.getPiece().setWhite(false);
                }
                spotList.add(spotObj);
            }
        }
      
        spotObj.checkMove(spotList);
        calculateScore.score(spotList);
    }

}


