package Model.Piece;

import Model.Enum.PieceTypes;

public class Queen extends Piece{

    public Queen(boolean white) {
        super(white);
    }

    public Queen() {
        this.setPieceType(PieceTypes.Queen);
        this.setPoint(9);
    }

}
