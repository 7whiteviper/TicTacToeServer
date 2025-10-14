package socket;

/**
 * Server response to a client request.
 */
public class Response {

    /** Enumeration for response status values. */
    public enum ResponseStatus { SUCCESS, FAILURE }

    private ResponseStatus status;
    private String message;

    /** Default constructor. */
    public Response() {}

    /** Full constructor. */
    public Response(ResponseStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    // Getters/Setters
    public ResponseStatus getStatus() { return status; }
    public void setStatus(ResponseStatus status) { this.status = status; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
