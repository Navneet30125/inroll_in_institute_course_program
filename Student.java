package com.education_institute_course_enrollment_system.program;

public class Student {
String name;
EducationInstitute educationInstitute;
public Student(String name, EducationInstitute educationInstitute ) {
	super();
	this.name = name;
	this.educationInstitute = educationInstitute ;
}

public void viewCoursesAndFees() {
		Courses[] courses = educationInstitute.getCourses();
		for(Courses course : courses) {
			System.out.println(course.getCourseId()+" : "+course.getCourseName()+" : "+course.getCourseFee());
		}
	}
public void viewOffers()
{
	  Offer[] offers = educationInstitute.getOffers();
	  for(Offer offer : offers)
	  {
		  System.out.println(offer.getOfferText());
	  }
}
public void enrollInCourse(int courseId) {
	educationInstitute.enrollStudentInCourses(courseId, name);
}
}
