package Pieces;

public abstract class Piece {
    private boolean captured;
    private boolean white;

    public boolean isWhite() {
        return this.white;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public boolean isCaptured() {
        return this.captured;
    }

    public void setCaptured(boolean captured) {
        this.captured = captured;
    }

    public abstract boolean canMove();
}
