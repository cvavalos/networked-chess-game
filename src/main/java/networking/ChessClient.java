import java.net.*;
import java.io.*;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

Socket socket;

public class ChessClient {
    public void sendMove() {
        socket = new Socket("localhost", 5000);

        BufferedReader input = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
        );

        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

        Scanner scanner = new Scanner(System.in);

        System.out.println(input.readLine());

        while(true) {
            System.out.print("Enter move (ex: 'Move e2-e4'): ");

            String move = scanner.nextLine();

            output.println(move);

            String response = input.readLine();

            System.out.println("Server: " + response);

            if(response.equals("Correct!")) {
                break;
            }
        }

        socket.close();
    }
}
