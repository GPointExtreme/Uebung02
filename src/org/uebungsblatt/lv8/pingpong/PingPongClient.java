package org.uebungsblatt.lv8.pingpong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class PingPongClient {

	public static void main(String[] args) {
		try (
			Socket client = new Socket("127.0.0.1", 3333);
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			OutputStreamWriter osw = new OutputStreamWriter(client.getOutputStream());
			PrintWriter pw = new PrintWriter(osw);
			InputStreamReader isr1 = new InputStreamReader(client.getInputStream());
			BufferedReader br1 = new BufferedReader(isr1);
			)
		{
			String line;
			while((line=br.readLine()) != null) {
				pw.println(line);
				pw.flush();
				System.out.println(br1.readLine());
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
