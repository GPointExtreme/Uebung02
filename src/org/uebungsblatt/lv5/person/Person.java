package org.uebungsblatt.lv5.person;

import java.io.Serializable;

public class Person implements Serializable {
	
	private String vorname;
	private String nachname;
	private int alter;
	
	public Person(String vorname, String nachname, int alter) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
	}

	@Override
	public String toString() {
		return "Person [vorname=" + vorname + ", nachname=" + nachname + ", alter=" + alter + "]";
	}

}
