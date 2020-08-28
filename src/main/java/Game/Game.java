package Game;

import Board.Board;

public class Game {
    private boolean gameOver;
    private boolean whitesTurn;
    private Board board;
    public Game() {
        this.gameOver = false;
        this.whitesTurn = true;
    }

    public void start() {
        while (!gameOver) {
            gameOver = true;
        }
    }

    @Override
    public String toString() {
        return "";
    }
}
