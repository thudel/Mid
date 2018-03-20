package com.cisc181.core;
import java.util.Date;
import java.util.UUID;

public class Semester {

	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	public Semester(UUID semID, Date SDate, Date EDate) {
		super();
		SemesterID = semID;
		StartDate = SDate;
		EndDate = EDate;
		
		}
		
	public UUID getSemesterID() {
		return SemesterID;
	}
	public void setSemesterID(UUID semID) {
		SemesterID = semID;
	}	
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date SDate) {
		StartDate = SDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date EDate) {
		EndDate = EDate;
	}
}
