package by.itacademy.ioexample.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainSerializeServer {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {

		try {

			System.out.println("1");
			ServerSocket serverSocket = new ServerSocket(9292);

			while (true) {

				Socket clientSocket = serverSocket.accept();

				try (ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream())) {

					Object obj = ois.readObject();
					System.out.println(obj);
					
					

				} catch (IOException e) {
					e.printStackTrace();
				}

				// byte[] data = new byte[10000];
				// clientSocket.getInputStream().read(data);

				// String msg = new String(data);

				System.out.println("client connected and wrote a msg");
				//System.out.println(msg);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
