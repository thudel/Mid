package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course  {
	
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	public Course(UUID Course_ID, String Course_Name, int Grade_Points, eMajor _Major) {
		super();
		CourseID = Course_ID;
		CourseName = Course_Name;
		GradePoints = Grade_Points;
		Major = _Major;
		
	}
	
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID Course_ID) {
		CourseID = Course_ID;
	}
	
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String Course_Name) {
		CourseName = Course_Name;
	}
	
	public int getGradePoints() {
		return GradePoints;
	}
	public void setGradePoints(int Grade_Points) {
		GradePoints = Grade_Points;
	}
	
	public eMajor getMajor() {
		return Major;
	}
	public void setMajor(eMajor _Major) {
		Major = _Major;
	}
}

