package Pieces;

import Board.Board;
import Coordinate.Coordinate;

public abstract class Piece {
    private boolean captured;
    private boolean white;
    private Coordinate currentLocation;

    public boolean isCaptured() {
        return this.captured;
    }

    public void setCaptured(boolean captured) {
        this.captured = captured;
    }

    public boolean isWhite() {
        return this.white;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public Coordinate getCurrentLocation() {
        return this.currentLocation;
    }

    public void setCurrentLocation(Coordinate currentLocation) {
        this.currentLocation = currentLocation;
    }

    public abstract boolean canMove(Board board, Coordinate end);
}
