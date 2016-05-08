package org.uebungsblatt.lv7.logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logger {
	
	private File file;

	public Logger(String path) {
		super();
		this.file = new File(path);
	}

	private void logMessage(ErrorMessage message) throws IOException {
		try (FileWriter fw = new FileWriter(file, true);
				PrintWriter pw = new PrintWriter(fw)) {
			pw.println(message.toLine());
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void logFatal(String message) throws IOException {
		String timeStamp = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
		ErrorMessage error = new ErrorMessage("FATAL", message, timeStamp);
		
		logMessage(error);
	}
	
	public void logError(String message) throws IOException {
		String timeStamp = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
		ErrorMessage error = new ErrorMessage("ERROR", message, timeStamp);
		
		logMessage(error);
	}
	
	public void logInfo(String message) throws IOException {
		String timeStamp = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
		ErrorMessage error = new ErrorMessage("INFO", message, timeStamp);
		
		logMessage(error);
	}
	
	public void logDebug(String message) throws IOException {
		String timeStamp = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
		ErrorMessage error = new ErrorMessage("DEBUG", message, timeStamp);
		
		logMessage(error);
	}

}
