package chess;

import boardgame.BoardException;

public class ChessException extends BoardException {
    private static final long serrialVersionUID = 1L;

    public ChessException(String message) {
        super(message);
    }
}
