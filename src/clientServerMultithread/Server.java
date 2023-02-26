package clientServerMultithread;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//public class Server {
//    public static void main(String[] args) {
//        try {
//            // Create server socket
//            ServerSocket serverSocket = new ServerSocket(8000);
//
//            while (true) {
//                // Accept incoming connections from clients
//                Socket clientSocket = serverSocket.accept();
//
//                // Create new client handler thread for each client
//                Thread thread = new Thread(new ClientHandler(clientSocket));
//                thread.start();
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            // Create server socket
            serverSocket = new ServerSocket(8000);

            // Wait for clients to connect
            while (true) {
                System.out.println("Waiting for client to connect...");

                // Accept client connection
                Socket socket = serverSocket.accept();
                System.out.println("Client connected: " + socket);

                // Create client handler and start it in a new thread
                ClientHandler clientHandler = new ClientHandler(socket);
                Thread thread = new Thread(clientHandler);
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close server socket when done
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class ClientHandler implements Runnable {
    private Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            // Create input and output streams from socket
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());

            // Receive requests from client
            while (true) {
                String request = (String) in.readObject();

                // Create Date object and send to client
                if (request.equals("Date")) {
                    java.util.Date date = new java.util.Date();
                    out.writeObject(date);
                }

                // Create Calendar object and send to client
                else if (request.equals("Calendar")) {
                    java.util.Calendar calendar = java.util.Calendar.getInstance();
                    out.writeObject(calendar);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
