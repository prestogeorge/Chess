package Pieces;

import Board.Board;
import Coordinate.Coordinate;

public class Pawn extends Piece {
    @Override
    public boolean canMove(Board board, Coordinate end) {
        return false;
    }
}
