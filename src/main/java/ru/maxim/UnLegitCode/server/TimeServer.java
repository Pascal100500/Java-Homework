package ru.maxim.UnLegitCode.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeServer {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(7777);

        System.out.println("Сервер запущен. Порт: 7777");

        while (true) {
            var clientSocket = serverSocket.accept();

            System.out.println("Клиент подключился!");

            LocalDateTime now = LocalDateTime.now();

            DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

            var nowString = now.format(formatter);

            var writer = clientSocket.getOutputStream();

            writer.write((nowString + "\n").getBytes());
        }
    }
}