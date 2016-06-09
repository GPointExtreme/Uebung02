package org.uebungsblatt.lv8.pingpong;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class PingPongServer {

	public static void main(String[] args) {
		try (
			ServerSocket server = new ServerSocket(3333);
			) 
		{
			while(true) {
				Socket client = server.accept();
				System.out.println("client connected");
				ClientCommunication cc = new ClientCommunication(client);
				Thread t = new Thread(cc);
				t.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
