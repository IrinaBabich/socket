package com.babich.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(3000);
        Socket socket = serverSocket.accept();

        OutputStream socketOutputStream = socket.getOutputStream();
        socketOutputStream.write("Hello client".getBytes());


        System.out.println("serverSocket+ " + socket);


    }
}
