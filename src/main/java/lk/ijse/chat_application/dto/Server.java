package lk.ijse.chat_application.dto;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.PrivateKey;

public class Server implements Runnable {
    //implementing singleton design pattern to avoid creating servers...

    private static Server server;
    private final ServerSocket serverSocket;

    private Server() throws IOException {
        this.serverSocket = new ServerSocket(3000);
        System.out.println("Server Started...");

    }

    public static Server getServerSocket() throws IOException {
        return server==null ? server = new Server() : server;
    }


    @Override
    public void run() {
        while(!serverSocket.isClosed()){
            System.out.println(("Listening..."));
            try {
                    Socket accepted = serverSocket.accept();
                ClientHandler clientHandler = new ClientHandler(accepted);
                Thread thread = new Thread(clientHandler);
                thread.start();
            } catch (IOException e) {
                    e.printStackTrace();
                }

        }
    }
}
