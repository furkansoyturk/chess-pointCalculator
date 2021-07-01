package Model.Piece;

import Model.Enum.PieceTypes;

public class Knight extends Piece{

    public Knight(boolean white) {
        super(white);
    }

    public Knight() {
        this.setPieceType(PieceTypes.Knight);
        this.setPoint(3);

    }
}
