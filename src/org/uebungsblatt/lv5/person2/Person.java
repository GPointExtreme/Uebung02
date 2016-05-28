package org.uebungsblatt.lv5.person2;

import java.io.Serializable;

public class Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6144479256276059813L;
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

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public int getAlter() {
		return alter;
	}

}
