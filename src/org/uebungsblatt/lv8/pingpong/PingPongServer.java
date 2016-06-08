package org.uebungsblatt.lv8.pingpong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class PingPongServer {

	public static void main(String[] args) {
		try (
			ServerSocket server = new ServerSocket(3333);
			Socket client = server.accept();
			) 
		{
			while(true) {
				processClient(client);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
				if(line.equals("ping")) {
					pw.println("pong");
				}
				else if(line.equals("pong")) {
					pw.println("ping");
				}
				else {
					pw.print("error");
				}
				pw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
