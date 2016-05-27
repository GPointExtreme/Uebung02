package org.uebungsblatt.lv8.time;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TimeClient {

	public static void main(String[] args) {

		try (
			Socket client = new Socket("127.0.0.1", 1111);
			) {
				try (
					InputStreamReader isr = new InputStreamReader(client.getInputStream());
					BufferedReader br = new BufferedReader(isr);
					) {
						System.out.println(br.readLine());
					
				} catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
