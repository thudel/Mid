package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void testStaffSalaries() throws PersonException{
		ArrayList<Staff> Test_Staff = new ArrayList<Staff>();
		Staff a = new Staff("A", "B", "C", new Date(1920,3,20), "123 address city, state, zip", "1234567890", "email@email.com", null, 0, 5.00, new Date(1950,5,17), null );
		Test_Staff.add(a);
		
		Staff b = new Staff("B", "C", "D", new Date(2005,3,20), "123 address city, state, zip", "548939176", "email@email.com", null, 0, 17.05, new Date(2010,5,17), null );
		Test_Staff.add(b);
		
		Staff c = new Staff("C", "B", "D", new Date(1995,9,15), "123 address city, state, zip", "9876543210", "email@email.com", null, 0, 5.78, new Date(2017,12,17), null );
		Test_Staff.add(c);
		
		Staff d = new Staff("D", "C", "D", new Date(1750,3,20), "123 address city, state, zip", "1235486984", "email@email.com",null, 0, 3.05, new Date(1957,5,8), null );
		Test_Staff.add(d);
		
		Staff e = new Staff("E", "C", "D", new Date(1750,3,20), "123 address city, state, zip", "12354869854654", "email@email.com", null, 0, 56.20, new Date(2003,5,8), null );
		Test_Staff.add(e);
		
		double salaryTotal = 0;
		
		for(Staff i: Test_Staff) {
			salaryTotal += i.getSalary();
		}
		salaryTotal = (int) salaryTotal/5;
		
		assertEquals(salaryTotal, 17.416);
	}
	

}
