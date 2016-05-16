package org.uebungsblatt.lv5.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ConsoleWriter {

	public static void main(String[] args) {
		
		File file = new File("C:\\temp\\ConsoleWriter.txt");
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			int data = 0;
			while((data=System.in.read()) != -1) {
				if(data == 'x') {
					break;
				}
				bos.write(data);
			}
			bos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
