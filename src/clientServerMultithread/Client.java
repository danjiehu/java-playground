package clientServerMultithread;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            // Connect to server
            Socket socket = new Socket("localhost", 8000);

            // Create output stream to send requests to server
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());

            // Send request for Date object
            out.writeObject("Date");

            // Create input stream to receive Date object from server
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());

            // Receive Date object from server
            Object dateObj = in.readObject();

            // Print Date object
            if (dateObj instanceof java.util.Date) {
                System.out.println(dateObj);
            }

            // Send request for Calendar object
            out.writeObject("Calendar");

            // Receive Calendar object from server
            Object calendarObj = in.readObject();

            // Print Calendar object
            if (calendarObj instanceof java.util.Calendar) {
                java.util.Calendar calendar = (java.util.Calendar) calendarObj;
                System.out.println(calendar.get(java.util.Calendar.DAY_OF_MONTH) + "/" +
                        calendar.get(java.util.Calendar.MONTH) + "/" +
                        calendar.get(java.util.Calendar.YEAR) + " " +
                        calendar.get(java.util.Calendar.ZONE_OFFSET));
            }

            // Close streams and socket
            out.close();
            in.close();
            socket.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
