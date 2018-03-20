package com.cisc181.core;

import java.util.Date;

public class PersonException extends Exception {

	private Person person;
	
	public PersonException(Person p, String s) {
		
		super(s);
		this.person = p;
	}
	
	public Person getp() {
		return person;
	}
}
