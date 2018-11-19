package by.itacademy.ioexample;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MailConcoleClient {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {

		try {
			
			
			Socket socket = new Socket("localhost", 9292);
			socket.getOutputStream().write("HelloServer".getBytes());
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
	}
}
