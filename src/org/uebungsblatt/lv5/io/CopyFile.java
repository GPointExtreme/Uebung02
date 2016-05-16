package org.uebungsblatt.lv5.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		
		File fileIn = new File("C:\\temp\\CopyFileIn.txt");
		File fileOut = new File("C:\\temp\\CopyFileOut.txt");
		
		try {
			FileInputStream fis = new FileInputStream(fileIn);
			FileOutputStream fos = new FileOutputStream(fileOut);
			
			int data = 0;
			while((data=fis.read()) != -1) {
				fos.write(data);
			}
			fos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
