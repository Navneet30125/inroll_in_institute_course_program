package com.education_institute_course_enrollment_system.program;

public class EducationInstituteApp {

	public static void main(String[] args)  throws InterruptedException{
		Courses[] courses = { new Courses(1, "Java", 29000), new Courses(2, ".Net", 25000),
				new Courses(3, "Python", 27000) };
		Offer[] offer = { new Offer("Special discount: Get 20% off on all Courses."),
				new Offer("Limited time offer: Enroll in any two courses and get one course free!") };
		EducationInstitute ei = new EducationInstitute(courses, offer);
		Student john = new Student("John", ei);
		Student alice = new Student("alice", ei);

		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println("Available Courses and fees: ");
				john.viewCoursesAndFees();
				System.out.println("Available Courses: ");
				john.viewOffers();
				john.enrollInCourse(1);
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				System.out.println("Available Courses and fees: ");
				alice.viewCoursesAndFees();
				System.out.println("Available Courses: ");
				john.viewOffers();
				john.enrollInCourse(3);
			}
		};
		t1.start();
		t1.join();
		System.out.println("...........................................");
		t2.start();
	}
}
