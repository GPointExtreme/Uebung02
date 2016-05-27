package org.uebungsblatt.lv8.time;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class TimeServer {

	public static void main(String[] args) {

		try (
			ServerSocket server = new ServerSocket(1111);
			) {
			
			while(true) {
				Socket client = server.accept();
				
				try (
						OutputStreamWriter osw = new OutputStreamWriter(new BufferedOutputStream(client.getOutputStream()));
					) {
					LocalDateTime datetime = LocalDateTime.now();
					osw.write(datetime.toString());
					osw.flush();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
