package Board;

import Coordinate.Coordinate;
import Pieces.Piece;

import java.util.HashMap;

public class Board {
    public Coordinate bottomLeft;
    public Coordinate bottomRight;
    public Coordinate topLeft;
    public Coordinate topRight;
    private HashMap<Coordinate, Piece> pieces;

    public Board(HashMap<Coordinate, Piece> pieces) {
        this.pieces = pieces;
        this.bottomLeft = new Coordinate(0, 0);
        this.bottomRight = new Coordinate(7, 0);
        this.topLeft = new Coordinate(0, 7);
        this.topRight = new Coordinate(7, 7);
    }
}
