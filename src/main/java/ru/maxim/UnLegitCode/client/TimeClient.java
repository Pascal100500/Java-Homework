package ru.maxim.UnLegitCode.client;

import java.io.IOException;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TimeClient {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 7777);

        System.out.println("Клиент подключился к серверу!");

        var reader = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
        );

        String message = reader.readLine();

        System.out.println(message);
    }
}
