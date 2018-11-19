package by.itacademy.ioexample;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import by.itacademy.run.Adress;
import by.itacademy.run.User;

public class MailSerializeClient {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {

		try {
			
			
			Socket socket = new Socket("localhost", 9292);
			
			
			//socket.getOutputStream().write("HelloServer".getBytes());
			
			User user = new User("Ivan",new Adress("Moscow"));
			
			try(ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream())){
				
				oos.writeObject(user);
				
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		}
	}
}
