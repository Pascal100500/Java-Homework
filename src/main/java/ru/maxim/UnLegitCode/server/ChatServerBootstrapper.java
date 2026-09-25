package ru.maxim.UnLegitCode.server;

public class ChatServerBootstrapper {

    public static void main(String[] args) throws Exception {
        try (var server = new ChatServer(55556)) {
            server.run();
        }
    }
}