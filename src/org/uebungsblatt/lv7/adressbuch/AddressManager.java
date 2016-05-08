package org.uebungsblatt.lv7.adressbuch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class AddressManager {
	
	private ArrayList<Address> list = new ArrayList<>();

	public ArrayList<Address> getList() {
		return list;
	}
	
	public void loadFromCsv(String path, String seperator) throws AdressLoadException, IOException, AddressLoadWrongException {
		File file = new File(path);
		
		try (FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr)) {
		
			String line;
			while((line = br.readLine()) != null) {
				String[] columns = line.split(seperator);
				
				if(columns.length != 4) {
					throw new AddressLoadWrongException();
				}
				
				Address a = new Address(columns[0], columns[1], columns[2], columns[3]);
				
				list.add(a);
			}
		}	
	}
	
	public void exportToCsv(String path, String seperator) throws AdressExportException, IOException {
		File file = new File(path);
		
		try (FileWriter fw = new FileWriter(file);
				PrintWriter pw = new PrintWriter(fw)) {
			for (Address address : list) {
				String line = address.toString();
				String[] array = line.split(",");
				
				for (String string : array) {
					pw.print(string + seperator);
				}
				pw.println();
			}
		}
	}
}
