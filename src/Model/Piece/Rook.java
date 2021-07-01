package Model.Piece;

import Model.Enum.PieceTypes;

public class Rook extends Piece{

    public Rook(boolean white) {
        super(white);
    }

    public Rook() {
        this.setPieceType(PieceTypes.Rook);
        this.setPoint(5);
    }
}
