package Pieces;

import Board.Board;
import Coordinate.Coordinate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
public class PawnTest {

    private Board board;
    @BeforeEach
    public void setup() {
        this.board = new Board(new HashMap<>());
    }

    @Test
    public void canMove_TrueWhenFrontEmptyWhite_test() {
        Pawn pawn = new Pawn(false, true, new Coordinate(0, 0));
        this.board.addPiece(pawn);
        assertTrue(pawn.canMove(this.board, new Coordinate(0, 1)));
    }

    @Test
    public void canMove_TrueWhenFrontEmptyBlack_test() {
        Pawn pawn = new Pawn(false, false, new Coordinate(0, 7));
        this.board.addPiece(pawn);
        assertTrue(pawn.canMove(this.board, new Coordinate(0, 6)));
    }

    @Test
    public void canMove_FalseWhenMoreThanOneSpaceWhite_test() {
        Pawn pawn = new Pawn(false, true, new Coordinate(0, 0));
        this.board.addPiece(pawn);
        assertFalse(pawn.canMove(this.board, new Coordinate(0, 2)));
    }

    @Test
    public void canMove_FalseWhenMoreThanOneSpaceBlack_test() {
        Pawn pawn = new Pawn(false, false, new Coordinate(0, 7));
        this.board.addPiece(pawn);
        assertFalse(pawn.canMove(this.board, new Coordinate(0, 5)));
    }
}