package Util;


import Model.Piece.Piece;
import Model.Spot;

import java.util.ArrayList;

public class CalculateScore  {
    
    
    public  void score(ArrayList<Spot> spotList) {
        
        double initialBlackScore = 0;
        double initialWhiteScore = 0;
        double whitePenalty = 0 ;
        double blackPenalty = 0 ;

        
       
        for(int i = 0; i < spotList.size(); i++ ){
            
            double penalty  = spotList.get(i).getPiece().getPoint();

            // Black and white piece scores according to board.txt regardless of threat calculation.
            if(spotList.get(i).getPiece().isWhite()){
                initialWhiteScore = initialWhiteScore + spotList.get(i).getPiece().getPoint();
            }
            if(!spotList.get(i).getPiece().isWhite()){
                initialBlackScore = initialBlackScore + spotList.get(i).getPiece().getPoint();
            }


            // white penalty point according to enemy threat
            if(spotList.get(i).getPiece().isWhite()){
                if(spotList.get(i).getPiece().isUnderThreat()){
                    whitePenalty =  whitePenalty + penalty/2 ;
                } 
            }
            // black penalty point according to enemy threat
            if(!spotList.get(i).getPiece().isWhite()){
                if(spotList.get(i).getPiece().isUnderThreat()){
                    blackPenalty =  blackPenalty + penalty/2 ;
                }
            }
            
            
        }

        //final black score
        initialBlackScore = initialBlackScore - blackPenalty;
        System.out.println("siyah : " + initialBlackScore );

        //final white score
        initialWhiteScore = initialWhiteScore - whitePenalty;
        System.out.println("beyaz : " + initialWhiteScore );

    }


}
