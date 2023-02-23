package networking;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class NumServer {
	
	int num = 0;
	// public static int count = 0;
	
	public static void main(String[] args) {
		
		NumServer server = new NumServer(); // calling class constructor
		try {
			System.out.println("calling server.go()...");
			server.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} // end of main
	
	public void go() throws IOException {
		// import java.net.ServerSocket;
		try (ServerSocket serverSock = new ServerSocket(8080)) { 
			
			
			
			System.out.println("Server is running");
			// while(true) ?
			
			Socket s = serverSock.accept();
			System.out.println("Connection accepted from Client");
				
			// server sends number to client
			PrintWriter writer = new PrintWriter(s.getOutputStream()); // ?
			
			InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
			BufferedReader reader = new BufferedReader(streamReader);
	
			// first time sending the number
			writer.write(num);
			writer.flush(); 
				
			// server receives number from client
				
			for (int i = 0; i<10; i++) {
				num = reader.read();
				System.out.print(i + ": ");
				System.out.println("number received " + num);
				num++;
				writer.write(num);
				writer.flush();
			}
			
			writer.close();
			reader.close();
			s.close();
			System.out.println("End 1");
			// }
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("End 2");
	} // end of go()

}
