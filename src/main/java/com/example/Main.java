package com.example;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Server avviato!");
        
        ServerSocket s1 = new ServerSocket(3000);
        Socket s = s1.accept();
        System.out.println("client collegato");
        

    }

}