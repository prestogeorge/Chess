package Pieces;

import Board.Board;
import Coordinate.Coordinate;

public class Pawn extends Piece {
    
    public Pawn(boolean captured, boolean white, Coordinate startLocation) {
        this.setCaptured(captured);
        this.setWhite(white);
        this.setCurrentLocation(startLocation);
    } 
    
    @Override
    public boolean canMove(Board board, Coordinate end) {
        if ((this.isWhite() && end.getY() - this.getCurrentLocation().getY() == 1) ||
                (!this.isWhite() && this.getCurrentLocation().getY() - end.getY() == 1)) {
                return true;
        }
        return false;
    }
}
