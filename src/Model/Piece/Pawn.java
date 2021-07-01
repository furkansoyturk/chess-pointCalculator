package Model.Piece;

import Model.Enum.PieceTypes;
import Model.Spot;

import java.util.ArrayList;

public class Pawn extends Piece{

    public Pawn(boolean white) {
        super(white);
    }

    public Pawn() {
        this.setPieceType(PieceTypes.Pawn);
        this.setPoint(1);


    }

}
