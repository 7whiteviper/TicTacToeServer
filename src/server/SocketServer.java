package server;

/**
 * Main socket server controller.
 * Will set up server and accept client connections in later milestones.
 */
public class SocketServer {

    /** Port the server listens on. */
    private final int PORT;

    /** Entry point. */
    public static void main(String[] args) {
        SocketServer server = new SocketServer();
        server.setup();
        server.startAcceptingRequest();
    }

    /** Default constructor uses port 5000. */
    public SocketServer() {
        this(5000);
    }

    /** Constructor to set port. */
    public SocketServer(int port) {
        this.PORT = port;
    }

    /** Prepare server resources (empty for now). */
    public void setup() {
        // TODO: implemented in later milestones
    }

    /** Begin accepting requests (empty for now). */
    public void startAcceptingRequest() {
        // TODO: implemented in later milestones
    }

    /** Getter for port. */
    public int getPort() {
        return PORT;
    }
}
