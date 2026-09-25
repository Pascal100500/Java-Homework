package ru.maxim.UnLegitCode.server;

public interface NetworkServer {

    void broadcast(String message, ClientHandler source);

    void removeClient(ClientHandler clientHandler);
}