package com.education_institute_course_enrollment_system.program;

public class EducationInstitute {
private Courses courses[];
private Offer offer[];
private int count;

public EducationInstitute(Courses[] courses, Offer[] offer) {
	super();
	this.courses = courses;
	this.offer = offer;
}
public Courses[] getCourses() {
	return courses;
}
public Offer[] getOffers() {
	return offer;
}
public int getCount() {
	return count;
}

public void enrollStudentInCourses(int courseId, String studentName) {
	for(int i=0; i<courses.length; i++) {
		if(courseId==courses[i].getCourseId()) {
			System.out.println(studentName+" enrolled in "+courses[i].getCourseName());
		}
	}
	}
}

