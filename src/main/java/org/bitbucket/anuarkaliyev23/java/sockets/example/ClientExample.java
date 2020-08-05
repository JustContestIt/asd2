package org.bitbucket.anuarkaliyev23.java.sockets.example;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientExample {
    public static void main(String[] args) throws IOException {
        //127.0.0.1 - Own Ip Address
        try (Socket client = new Socket("127.0.0.1", 8080)) {
            //Write something to Server
            Scanner console = new Scanner(System.in);
            while (true) {
                PrintWriter writer = new PrintWriter(client.getOutputStream(), true);
                writer.println(console.nextLine());
            }
        }
    }
}
