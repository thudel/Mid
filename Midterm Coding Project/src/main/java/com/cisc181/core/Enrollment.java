package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment() {
		super();
	}
	public Enrollment(UUID Student_ID, UUID Section_ID) {
		super();
		StudentID = Student_ID;
		SectionID = Section_ID;
		EnrollmentID = UUID.randomUUID();
	}
	public UUID getStudentID() {
		return StudentID;
	}
	public void setStudentID(UUID Student_ID) {
		StudentID = Student_ID;
	}
	public UUID getSectionID() {
		return SectionID;
	}
	public void setSectionID(UUID Section_ID) {
		SectionID = Section_ID;
	}
	public double getGrade() {
		return Grade;
	}
	public void SetGrade(double grade) {
		Grade = grade;
	}
}
