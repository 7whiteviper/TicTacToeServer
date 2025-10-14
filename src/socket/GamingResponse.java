package socket;

/**
 * Response to a REQUEST_MOVE request.
 * Subclass of Response.
 */
public class GamingResponse extends Response {

    private int move;       // opponent last move (0..8)
    private boolean active; // opponent still active in game

    /** Default constructor (calls super). */
    public GamingResponse() {
        super();
    }

    /** Full constructor (calls super). */
    public GamingResponse(ResponseStatus status, String message, int move, boolean active) {
        super(status, message);
        this.move = move;
        this.active = active;
    }

    // Getters/Setters
    public int getMove() { return move; }
    public void setMove(int move) { this.move = move; }
    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
}
