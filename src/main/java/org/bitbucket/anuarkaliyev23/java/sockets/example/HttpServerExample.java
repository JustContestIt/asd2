package org.bitbucket.anuarkaliyev23.java.sockets.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServerExample {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            while (true) {
                try (Socket socket = serverSocket.accept()) {
                    PrintWriter writer = new PrintWriter(socket.getOutputStream(), false);
                    writer.print("HTTP/1.1 200 OK");
                    writer.print("\r\n\r\n");
                    writer.print(
                            "<h1>Hello!</h1>" +
                            "<p>Thi is an example of text</p>");
                    writer.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
