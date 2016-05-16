package org.uebungsblatt.lv5.person;

public class PersonDemo {

	public static void main(String[] args) {
		
		PersonManager m = new PersonManager();
		
		m.addPerson(new Person("Dominik", "Geiger", 24));
		m.addPerson(new Person("David", "Erlacher", 23));
		
		m.savePerson("C:\\temp\\PersonSave.txt");

	}

}
