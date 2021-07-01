package Model.Piece;

import Model.Enum.PieceTypes;

public  class Piece {
    private boolean white = false;
    private boolean underThreat = false;
    private int point;

   
    private PieceTypes pieceType;

    public Piece(){

    }
    
    public Piece(boolean white) {
        this.setWhite(white);
    }
    
    public PieceTypes getPieceType() {
        return pieceType;
    }

    public void setPieceType(PieceTypes pieceType) {
        this.pieceType = pieceType;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public boolean isWhite() {
        return white;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }


    public void setUnderThreat(boolean underThreat) {
        this.underThreat = underThreat;
    }

    public boolean isUnderThreat() {
        return underThreat;
    }


}

