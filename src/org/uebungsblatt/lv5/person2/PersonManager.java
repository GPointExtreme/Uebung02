package org.uebungsblatt.lv5.person2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import org.uebungsblatt.lv5.person.Person;

public class PersonManager {
	
	private ArrayList<Person> list = new ArrayList<>();
	
	public void addPerson1(Person p) {
		list.add(p);
	}
	
	public void savePerson1(String path) {
		File file = new File(path);
		
		try (
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			){
			for (Person person : list) {
				oos.writeObject(person);
			}
			oos.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void loadPerson1(String path) {
		File file = new File(path);
		
		try (
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			){
			Person p;
			while((p=(Person) ois.readObject()) != null) {
				System.out.println(p);
			}
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
