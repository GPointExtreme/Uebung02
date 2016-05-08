package org.uebungsblatt.lv7.logger;

import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		
		Logger log = new Logger("C:\\temp\\logger.txt");
		
		try {
			log.logFatal("too hot");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			log.logDebug("pipapo");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
