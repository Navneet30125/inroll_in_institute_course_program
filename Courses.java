package com.education_institute_course_enrollment_system.program;

public class Courses {
private int id;
private String name;
private double fee;
public Courses(int id, String name, double fee) {
	super();
	this.id = id;
	this.name = name;
	this.fee = fee;
}
public int getCourseId() {
	return id;
}
public String getCourseName() {
	return name;
}
public double getCourseFee() {
	return fee;
}
@Override
public String toString() {
	return "Courses [id=" + id + ", name=" + name + ", fee=" + fee + "]";
}

}
