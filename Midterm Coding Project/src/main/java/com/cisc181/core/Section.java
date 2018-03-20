package com.cisc181.core;

import java.util.UUID;

public class Section {
	
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;

	public Section(UUID Course_ID, UUID Semester_ID, UUID Section_ID, int Room_ID) {
		super();
		CourseID = Course_ID;
		SemesterID = Semester_ID;
		SectionID = Section_ID;
		RoomID = Room_ID;
	}
	
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID Course_ID) {
		CourseID = Course_ID;
	}
	public UUID getSemesterID() {
		return SemesterID;
	}
	public void setSemesterID(UUID Semester_ID) {
		SemesterID = Semester_ID;
	}
	public UUID getSectionID() {
		return SectionID;
	}
	public void setSectionID(UUID Section_ID) {
		SectionID = Section_ID;
	}
	public int getRoomID() {
		return RoomID;
	}
	public void setRoomID(int Room_ID) {
		RoomID = Room_ID;
	}
}
