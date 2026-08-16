import java.net.*;
import java.io.*;
import java.util.Random;

import com.fasterxml.jackson.databind.ObjectMapper;

ServerSocket serverSocket;

public class ChessServer {
    public void initializeSocket() throws IOException {
        serverSocket = new ServerSocket(5000);

        System.out.println("Waiting for player...");

        Socket socket = serverSocket.accept();
    }

    public void receiveMessage() {

    }

    public void verifyMove() {

    }
}
