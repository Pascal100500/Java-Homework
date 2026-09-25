package ru.maxim.UnLegitCode.client;

import lombok.AccessLevel;
import lombok.SneakyThrows;
import lombok.experimental.FieldDefaults;

import java.io.*;
import java.net.Socket;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ChatClient implements AutoCloseable, Runnable {

    Socket socket;
    BufferedReader reader;
    PrintWriter writer;
    Thread serverReadingThread;

    public ChatClient(String host, int port) throws IOException {
        socket = new Socket(host, port);
        reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
        serverReadingThread = new Thread(() -> {
            String line;
            try {
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        serverReadingThread.setDaemon(true);
    }

    @Override
    @SneakyThrows
    public void run() {
        System.out.println("Starting client...");

        serverReadingThread.start();

        var consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String userInput;
        while ((userInput = consoleReader.readLine()) != null) {
            writer.println(userInput);

            if (userInput.equalsIgnoreCase("/exit")) {
                break;
            }
        }
    }

    @Override
    public void close() throws Exception {
        socket.close();
    }
}