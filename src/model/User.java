package model;

/**
 * Models a user who will play a TicTacToe game.
 * Maps to DB table 'User'.
 */
public class User {
    private String username;
    private String password;
    private String displayName;
    private boolean online;

    /** Default constructor. */
    public User() {}

    /** Full constructor. */
    public User(String username, String password, String displayName, boolean online) {
        this.username = username;
        this.password = password;
        this.displayName = displayName;
        this.online = online;
    }

    // Getters/Setters
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getDisplayName() { return displayName; }
    public void setDisplayName(String displayName) { this.displayName = displayName; }
    public boolean isOnline() { return online; }
    public void setOnline(boolean online) { this.online = online; }

    /** Uses username as unique attribute. */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User other = (User) o;
        return username != null && username.equals(other.username);
    }

    @Override
    public int hashCode() {
        return username == null ? 0 : username.hashCode();
    }
}
