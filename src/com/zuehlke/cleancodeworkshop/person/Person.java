package com.zuehlke.cleancodeworkshop.person;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String familyName;
	private String givenName;
	private String nationality;
	private boolean capitalizeSurname;
	private boolean olympicMode;

	private static List<String> surnameFirst = new ArrayList<String>();
	static {
		surnameFirst.add("CHN");
		surnameFirst.add("KOR");
		// etc...
	}

	public Person(String familyName, String givenName, String nationality) {
		this(familyName, givenName, nationality, false, false);
	}

	public Person(String familyName, String givenName, String nationality,
			boolean olympicMode, boolean capitalizeSurname) {
		this.familyName = familyName;
		this.givenName = givenName;
		this.nationality = nationality;
		this.capitalizeSurname = capitalizeSurname;
		this.olympicMode = olympicMode;
	}

	@Override
	public String toString() {
		return nameString();
	}

	private String nameString() {
		String surname = familyName;
		if (capitalizeSurname) {
			surname = familyName.toUpperCase();
		}
		if (surnameFirst())
			return surname + " " + givenName;
		else
			return givenName + " " + surname;
	}

	private boolean surnameFirst() {
		if (!olympicMode)
			return false;
		return surnameFirst.contains(nationality);
	}

}
