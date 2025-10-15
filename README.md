TicTacToeServer — Milestone 1 

This document summarizes what will be presented for the Milestone 1 demo in class and how the project is organized. 

1) Scope of Milestone 1

A server-side skeleton for a Tic-Tac-Toe application. Networking/DB logic is not implemented yet. Milestone 1 verifies:

Project created with JDK 17.
Seven classes across three packages (model, socket, server).
Libraries added: Gson 2.10.1 and SQLite JDBC 3.43.0.0.
Javadoc generated to the doc/ directory.
Code pushed to GitHub with a clear commit history.

2) Project Structure

Typical top-level tree:
TicTacToeServer/
├─ .gitignore
├─ lib/                         # gson-2.10.1.jar, sqlite-jdbc-3.43.0.0.jar
├─ doc/                         # generated Javadoc (index.html, etc.)
├─ src/
│  ├─ model/
│  │  ├─ User.java              # user attributes (username, displayName, password, online)
│  │  └─ Event.java             # pairing/game state (EventStatus, turn, move)
│  ├─ socket/
│  │  ├─ Request.java           # client→server message (RequestType + data payload)
│  │  ├─ Response.java          # server→client reply (ResponseStatus + message)
│  │  └─ GamingResponse.java    # reply to REQUEST_MOVE (last move + active flag)
│  └─ server/
│     ├─ SocketServer.java      # entry point; setup() and startAcceptingRequest() stubs
│     └─ ServerHandler.java     # per-client thread; run()/close() stubs

Packages and roles:

model
User: represents a player; equality based on username.
Event: represents invitation/game lifecycle; includes EventStatus {PENDING, DECLINED, ACCEPTED, PLAYING, COMPLETED, ABORTED}, turn (username who moved last), and last move (0–8).
socket
Request: client request with RequestType (e.g., LOGIN, REGISTER, REQUEST_MOVE, etc.) and serialized data (e.g., JSON).
Response: standard reply with ResponseStatus {SUCCESS, FAILURE} and message.
GamingResponse: specialized response to REQUEST_MOVE including move and active.
server
SocketServer: main class; constructs server and calls stubs setup() and startAcceptingRequest().
ServerHandler: thread class for per-client I/O; run() and close() to be implemented later.

3) Libraries

Gson 2.10.1 — JSON serialization/deserialization (used for the socket payloads).
SQLite JDBC 3.43.0.0 — database driver for later milestones (no DB code required yet).
Added via IntelliJ Project Structure → Modules → Dependencies → + → From Maven…, JARs stored in lib/.

4) Build & Run (current milestone)

Build: IntelliJ → Build → Build Project; expect “Build completed successfully.”


5) Javadoc

Generated via Tools → Generate JavaDoc…
Scope: Whole project
Output: <project-root>/doc
Demonstrate by opening doc/index.html and navigating to class docs.

6) GitHub (what to present)

Show the repository URL and commit history reflecting:
Initial project & packages
Added seven classes
Added libraries
(Optional) Javadoc committed if required

Confirm collaborators.

code: 
git init
git add .
git commit -m "Milestone 1: classes, libs, javadoc"
git remote add origin https://github.com/<username>/TicTacToeServer.git
git branch -M main
git push -u origin main


