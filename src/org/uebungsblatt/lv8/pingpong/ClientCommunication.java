package org.uebungsblatt.lv8.pingpong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientCommunication implements Runnable{
	
	private Socket client;
	private static Object lock = new Object();
	
	public ClientCommunication(Socket client) {
		super();
		this.client = client;
	}

	private static void processClient(Socket client) {
		try (
			InputStreamReader isr = new InputStreamReader(client.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			OutputStreamWriter osw = new OutputStreamWriter(client.getOutputStream());
			PrintWriter pw = new PrintWriter(osw);
			)
		{
			String line;
			while((line = br.readLine()) != null) {
				synchronized (lock) { // richtig oder falsch? Fragen!
					if(line.equals("ping")) {
						pw.println("pong");
					}
					else if(line.equals("pong")) {
						pw.println("ping");
					}
					else if(line.equals("exit")) {
						pw.println("exit");
						break;
					}
					else {
						pw.println("error");
					}
					pw.flush();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		processClient(client);	
	}

}
