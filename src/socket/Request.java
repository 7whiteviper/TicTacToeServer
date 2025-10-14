package socket;

/**
 * Client request sent to the server.
 */
public class Request {

    /** Enumeration of request types the client can send. */
    public enum RequestType {
        LOGIN,
        REGISTER,
        UPDATE_PAIRING,
        SEND_INVITATION,
        ACCEPT_INVITATION,
        DECLINE_INVITATION,
        ACKNOWLEDGE_RESPONSE,
        REQUEST_MOVE,
        SEND_MOVE,
        ABORT_GAME,
        COMPLETE_GAME
    }

    private RequestType type;
    /**
     * Serialized payload as a String (e.g., JSON via Gson).
     * May represent a String, Integer, or User serialized value.
     */
    private String data;

    /** Default constructor. */
    public Request() {}

    /** Full constructor. */
    public Request(RequestType type, String data) {
        this.type = type;
        this.data = data;
    }

    // Getters/Setters
    public RequestType getType() { return type; }
    public void setType(RequestType type) { this.type = type; }
    public String getData() { return data; }
    public void setData(String data) { this.data = data; }
}
