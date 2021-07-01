package Model;

import Model.Piece.Piece;
import java.util.ArrayList;
import java.util.Optional;

public class Spot {
    
    private Piece piece;
    private int x;
    private int y;


    public Spot() {

    }
    
    public Spot(int x, int y, Piece piece) {
        this.setPiece(piece);
        this.setX(x);
        this.setY(y);
    }
    

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

  

    // it checks available spots for  knight and bishop. Also mark enemy if is hits.
    public void checkMove(ArrayList<Spot> spotList) {
        
        for (int i=0; i< spotList.size(); i++){

            Spot s = spotList.get(i);

            if(s != null){
                switch (s.piece.getPieceType()) {
                    case Bishop:
                        // up/down - right/left refers to bishop's move 

                        //white Bishop direction
                        if(spotList.get(i).piece.isWhite()){
                            // j refers coordinate of x direction between 0,7 and y direction between 0,-7 ;

                            // up-right
                            for(int j=1; j<8; j++) {

                                int finalJ = j;

                                Optional<Spot> enemyCandidate = spotList.stream()
                                        .filter((spot) -> spot.getX() == s.getX() + finalJ && spot.getY() == s.getY() + finalJ )
                                        .findFirst();

                                if(enemyCandidate.isPresent() && enemyCandidate.get().piece.isWhite()) {
                                   break;
                                }
                                if (enemyCandidate.isPresent()) {
                                    enemyCandidate.get().piece.setUnderThreat(true);

                                    break;
                                }
                            }
                            // up-left
                            for(int j=1; j<8; j++) {

                                int finalJ = j;

                                Optional<Spot> enemyCandidate = spotList.stream()
                                        .filter((spot) -> spot.getX() == s.getX() - finalJ && spot.getY() == s.getY() + finalJ )
                                        .findFirst();

                                if(enemyCandidate.isPresent() && enemyCandidate.get().piece.isWhite()) {
                                    break;
                                }
                                if (enemyCandidate.isPresent()) {
                                    enemyCandidate.get().piece.setUnderThreat(true);

                                    break;
                                }
                            }

                            // down-left
                            for(int j=1; j<8; j++) {

                                int finalJ = j;

                                Optional<Spot> enemyCandidate = spotList.stream()
                                        .filter((spot) -> spot.getX() == s.getX() - finalJ && spot.getY() == s.getY() - finalJ )
                                        .findFirst();

                                if(enemyCandidate.isPresent() && enemyCandidate.get().piece.isWhite()) {
                                    break;
                                }
                                if (enemyCandidate.isPresent()) {
                                    enemyCandidate.get().piece.setUnderThreat(true);

                                    break;
                                }
                            }

                            // down-right
                            for(int j=1; j<8; j++) {

                                int finalJ = j;

                                Optional<Spot> enemyCandidate = spotList.stream()
                                        .filter((spot) -> spot.getX() == s.getX() - finalJ && spot.getY() == s.getY() - finalJ )
                                        .findFirst();

                                if(enemyCandidate.isPresent() && enemyCandidate.get().piece.isWhite()) {
                                    break;
                                }
                                if (enemyCandidate.isPresent()) {
                                    enemyCandidate.get().piece.setUnderThreat(true);

                                    break;
                                }
                            }
                        } else {
                            // black Bishop direction

                            // j refers coordinate of x direction between 0,7 and y direction between 0,-7 ;

                            // down-right
                            for(int j=1; j<8; j++) {

                                int finalJ = j;

                                Optional<Spot> enemyCandidate = spotList.stream()
                                        .filter((spot) -> spot.getX() == s.getX() + finalJ && spot.getY() == s.getY() - finalJ )
                                        .findFirst();

                                if(enemyCandidate.isPresent() && !enemyCandidate.get().piece.isWhite()) {
                                    break;
                                }
                                if (enemyCandidate.isPresent()) {
                                    enemyCandidate.get().piece.setUnderThreat(true);

                                    break;
                                }
                            }
                            // down-left
                            for(int j=1; j<8; j++) {

                                int finalJ = j;

                                Optional<Spot> enemyCandidate = spotList.stream()
                                        .filter((spot) -> spot.getX() == s.getX() - finalJ && spot.getY() == s.getY() - finalJ )
                                        .findFirst();

                                if(enemyCandidate.isPresent() && !enemyCandidate.get().piece.isWhite()) {
                                    break;
                                }
                                if (enemyCandidate.isPresent()) {
                                    enemyCandidate.get().piece.setUnderThreat(true);

                                    break;
                                }
                            }
                            // up-right
                            for(int j=1; j<8; j++) {

                                int finalJ = j;

                                Optional<Spot> enemyCandidate = spotList.stream()
                                        .filter((spot) -> spot.getX() == s.getX() + finalJ && spot.getY() == s.getY() + finalJ )
                                        .findFirst();

                                if(enemyCandidate.isPresent() && !enemyCandidate.get().piece.isWhite()) {
                                    break;
                                }
                                if (enemyCandidate.isPresent()) {
                                    enemyCandidate.get().piece.setUnderThreat(true);

                                    break;
                                }
                            }
                            // up-left
                            for(int j=1; j<8; j++) {
                                
                                int finalJ = j;

                                Optional<Spot> enemyCandidate = spotList.stream()
                                        .filter((spot) -> spot.getX() == s.getX() - finalJ && spot.getY() == s.getY() - finalJ )
                                        .findFirst();

                                if(enemyCandidate.isPresent() && !enemyCandidate.get().piece.isWhite()) {
                                    break;
                                }
                                if (enemyCandidate.isPresent()) {
                                    enemyCandidate.get().piece.setUnderThreat(true);

                                    break;
                                }
                            }
                        }
                        break;
                    case Knight:
                        // up/down - right/left refers to knight's move 

                        // white Knight direction
                        if(spotList.get(i).piece.isWhite()) {
                            //up2 (current coordinate to y+2)
                            if(s.getY() + 2 <= 0 ){
                                //up2, right1
                                if(s.getX()+1 <= 7) {
                                    Optional<Spot> enemyCandidate = spotList.stream()
                                        .filter((spot) -> spot.getX() == s.getX() + 1  && spot.getY() == s.getY() + 2 && !spot.piece.isWhite())
                                        .findFirst();

                                    enemyCandidate.ifPresent(spot -> spot.piece.setUnderThreat(true));
                                }
                                //up2, left1
                                if(s.getX()-1 >= 0) {
                                    Optional<Spot> enemyCandidate = spotList.stream()
                                            .filter((spot) -> spot.getX() == s.getX() - 1  && spot.getY() == s.getY() + 2 && !spot.piece.isWhite())
                                            .findFirst();

                                    enemyCandidate.ifPresent(spot -> spot.piece.setUnderThreat(true));
                                }
                            }
                            //up1 (current coordinate to y+1)
                            if(s.getY() + 1 <= 0 ){
                                //up1, right2
                                if(s.getX()+2 <= 7) {
                                    Optional<Spot> enemyCandidate = spotList.stream()
                                            .filter((spot) -> spot.getX() == s.getX() + 2  && spot.getY() == s.getY() + 1 && !spot.piece.isWhite())
                                            .findFirst();

                                    enemyCandidate.ifPresent(spot -> spot.piece.setUnderThreat(true));
                                }
                                //up1, left2
                                if(s.getX()-2 >= 0) {
                                    Optional<Spot> enemyCandidate = spotList.stream()
                                            .filter((spot) -> spot.getX() == s.getX() - 2  && spot.getY() == s.getY() + 1 && !spot.piece.isWhite())
                                            .findFirst();

                                    enemyCandidate.ifPresent(spot -> spot.piece.setUnderThreat(true));
                                }
                            }
                            //down1 (current coordinate to y-1)
                            if(s.getY() - 1 >= -7 ){
                                //down1, right2
                                if(s.getX()+2 <= 7) {
                                    Optional<Spot> enemyCandidate = spotList.stream()
                                            .filter((spot) -> spot.getX() == s.getX() + 2  && spot.getY() == s.getY() - 1 && !spot.piece.isWhite())
                                            .findFirst();

                                    enemyCandidate.ifPresent(spot -> spot.piece.setUnderThreat(true));
                                }
                                //down1, left2
                                if(s.getX()-2 >= 0) {
                                    Optional<Spot> enemyCandidate = spotList.stream()
                                            .filter((spot) -> spot.getX() == s.getX() - 2  && spot.getY() == s.getY() - 1 && !spot.piece.isWhite())
                                            .findFirst();

                                    enemyCandidate.ifPresent(spot -> spot.piece.setUnderThreat(true));
                                }
                            }
                            //down2 (current coordinate to y-2)
                            if(s.getY() - 2 >= -7 ){
                                //down2, right1
                                if(s.getX()+1 <= 7) {
                                    Optional<Spot> enemyCandidate = spotList.stream()
                                            .filter((spot) -> spot.getX() == s.getX() + 1  && spot.getY() == s.getY() - 2 && !spot.piece.isWhite())
                                            .findFirst();

                                    enemyCandidate.ifPresent(spot -> spot.piece.setUnderThreat(true));
                                }
                                //down2, left1
                                if(s.getX()-1 >= 0) {
                                    Optional<Spot> enemyCandidate = spotList.stream()
                                            .filter((spot) -> spot.getX() == s.getX() - 1  && spot.getY() == s.getY() - 2 && !spot.piece.isWhite())
                                            .findFirst();

                                    enemyCandidate.ifPresent(spot -> spot.piece.setUnderThreat(true));
                                }
                            }
                            
                        } else {
                            // black Knight direction

                            //up2 (current coordinate to y+2)
                            if(s.getY() + 2 <= 0 ){
                                //up2, right1
                                if(s.getX()+1 <= 7) {
                                    Optional<Spot> enemyCandidate = spotList.stream()
                                            .filter((spot) -> spot.getX() == s.getX() + 2  && spot.getY() == s.getY() + 2 && spot.piece.isWhite())
                                            .findFirst();

                                    enemyCandidate.ifPresent(spot -> spot.piece.setUnderThreat(true));
                                }
                                //up2, left1
                                if(s.getX()-1 >= 0) {
                                    Optional<Spot> enemyCandidate = spotList.stream()
                                            .filter((spot) -> spot.getX() == s.getX() + 2  && spot.getY() == s.getY() + 2 && spot.piece.isWhite())
                                            .findFirst();

                                    enemyCandidate.ifPresent(spot -> spot.piece.setUnderThreat(true));
                                }

                            }
                            //up1 (current coordinate to y+1)
                            if(s.getY() + 1 <= 0 ){
                                //up1, right2
                                if(s.getX()+2 <= 7) {
                                    Optional<Spot> enemyCandidate = spotList.stream()
                                            .filter((spot) -> spot.getX() == s.getX() + 2  && spot.getY() == s.getY() + 1 && spot.piece.isWhite())
                                            .findFirst();

                                    enemyCandidate.ifPresent(spot -> spot.piece.setUnderThreat(true));
                                }
                                //up1, left2
                                if(s.getX()-2 >= 0) {
                                    Optional<Spot> enemyCandidate = spotList.stream()
                                            .filter((spot) -> spot.getX() == s.getX() - 2  && spot.getY() == s.getY() + 1 && spot.piece.isWhite())
                                            .findFirst();

                                    enemyCandidate.ifPresent(spot -> spot.piece.setUnderThreat(true));
                                }
                            }
                            //down1 (current coordinate to y-1)
                            if(s.getY() - 1 >= -7 ){
                                //down1, right2
                                if(s.getX()+2 <= 7) {
                                    Optional<Spot> enemyCandidate = spotList.stream()
                                            .filter((spot) -> spot.getX() == s.getX() + 2  && spot.getY() == s.getY() - 1 && spot.piece.isWhite())
                                            .findFirst();

                                    enemyCandidate.ifPresent(spot -> spot.piece.setUnderThreat(true));
                                }
                                //down1, left2
                                if(s.getX()-2 >= 0) {
                                    Optional<Spot> enemyCandidate = spotList.stream()
                                            .filter((spot) -> spot.getX() == s.getX() - 2  && spot.getY() == s.getY() - 1 && spot.piece.isWhite())
                                            .findFirst();

                                    enemyCandidate.ifPresent(spot -> spot.piece.setUnderThreat(true));
                                }
                            }
                            //down2 (current coordinate to y-2)
                            if(s.getY() - 2 >= -7 ){
                                //down2, right1
                                if(s.getX()+1 <= 7) {
                                    Optional<Spot> enemyCandidate = spotList.stream()
                                            .filter((spot) -> spot.getX() == s.getX() + 1  && spot.getY() == s.getY() - 2 && spot.piece.isWhite())
                                            .findFirst();

                                    enemyCandidate.ifPresent(spot -> spot.piece.setUnderThreat(true));
                                }
                                //down2, left1
                                if(s.getX()-1 >= 0) {
                                    Optional<Spot> enemyCandidate = spotList.stream()
                                            .filter((spot) -> spot.getX() == s.getX() - 1  && spot.getY() == s.getY() - 2 && spot.piece.isWhite())
                                            .findFirst();

                                    enemyCandidate.ifPresent(spot -> spot.piece.setUnderThreat(true));
                                }
                            }

                        }
                        break;
                }
            }
        }
        

    }

    // custom to string to check input.txt
//    @Override
//    public String toString() {
//        String a = "Spot{" +
//                "piece=" + piece +
//                ", x=" + x +
//                ", y=" + y;
//        if (this.piece.isWhite()) {
//            a = a + "beyaz }";
//        } else {
//            a = a + "siyah } ";
//
//        }
//        return a;
//    }
}