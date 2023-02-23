package networking;

import java.io.IOException;
import java.net.UnknownHostException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.net.Socket;

public class NumClient {
	
	// public static int count = 0; 
	
	public static void main(String[] args) {
		
		NumClient client = new NumClient();
	
			client.go();
		
		
	} // end of main
	
	public void go()
	{
		Socket s=null;
		try {
			s = new Socket("localhost", 8080);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Server name error");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Client connected to server ");
		
		InputStreamReader streamReader;
		try {
			streamReader = new InputStreamReader(s.getInputStream());
		
		BufferedReader reader = new BufferedReader(streamReader);
		PrintWriter writer = new PrintWriter(s.getOutputStream()); 
		
		int num = reader.read();
		System.out.println("The number read from server is: " + num);
		
		for (int i = 0; i<10; i++) {
			num++;
			System.out.print(i + ": ");
			System.out.println("number to send " + num);
			// PrintWriter writer = new PrintWriter(s.getOutputStream()); 
			
			writer.write(num);
			writer.flush();
			
		
		
	
	
		}
		writer.close();
		reader.close();
		s.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Stream error");
		} // ?
	
		
	} // end of go()

} // end of class
