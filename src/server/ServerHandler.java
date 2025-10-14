package server;

/**
 * Handles I/O with a single client connection in its own thread.
 */
public class ServerHandler extends Thread {

    /** Default constructor. */
    public ServerHandler() {}

    /** Thread run method (empty for now). */
    @Override
    public void run() {
        // TODO: handle per-client communication in later milestones
    }

    /** Close the client's connection (empty for now). */
    public void close() {
        // TODO: clean up resources
    }
}
