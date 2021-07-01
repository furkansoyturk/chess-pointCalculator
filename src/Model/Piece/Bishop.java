package Model.Piece;

import Model.Enum.PieceTypes;

public class Bishop extends Piece {
    
    public Bishop() {
        this.setPieceType(PieceTypes.Bishop);
        this.setPoint(3);
    }

    public Bishop(boolean white){
        super(white);
    }


}
