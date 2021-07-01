package Model.Piece;

import Model.Enum.PieceTypes;

public class King extends Piece {

    public King(boolean white) {
        super(white);
    }

    public King() {
        this.setPieceType(PieceTypes.King);
        this.setPoint(100);

    }

}
