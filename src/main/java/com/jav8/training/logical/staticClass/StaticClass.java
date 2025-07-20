package com.jav8.training.logical.staticClass;

class Student {
	int rollno;
	String name;
	String schoolName;
	// creating static variables
	static int count = 0; // will get memory only once and retain its value
	static String COLLEGE = "JAVA COLLEGE";

	// Static Block
	/*
	 * Note : - whenever you create the object and initialize it 1. before
	 * creating object and initialize it , Static Block will execute first.  
	 * then Constructor method will execute and will initialize the created
	 * class object.
	 */
	static {

		String STATIC_BOLCK_NAME = "MAIN BLOCK";
		staticBlockName(STATIC_BOLCK_NAME);

	}

	// Static class
	static class CHILD_STANDARD {
		static String STANDARD = "Inside Class X";
	}

	Student() {

		count++; // here we are increasing counter from constructor

	}

	Student(int r, String n) {
		rollno = r;
		name = n;
		System.out.println("Constructor  is Called to initialize the object.");
	}

	void display() {

		System.out.println(count + "  " + rollno + " " + name + " " + COLLEGE);// here we are accessing static variable.																				
	}

	static void changeCollege(String collegeName) {
		
			//schoolName="old school";
			// can't make a static reference to non-static field (schoolName)
		COLLEGE = collegeName;
		//localMethod("sss");
		// can't make a static reference to non-static method (schoolName)
	}

	void localMethod(String Block) {
		System.out.println(Block);

	}

	static void staticBlockName(String Block) {
		System.out.println(Block);
	}
}

public class StaticClass {
	public static void main(String args[]) {
		Student s1 = new Student(111, "Karan");
		System.out.println(Student.CHILD_STANDARD.STANDARD); // without creating class (Student) object, we can access the nested Static Class (CHILD_STANDARD)

		Student.changeCollege("SPRING COLLEGE");// without creating class (Student ) object . we can access the static method changeCollege.
		s1.display();

		Student s2 = new Student(222, "Aryan");
		System.out.println(Student.COLLEGE); // without creating class (Student) object . we can access the static variable COLLEGE.
		s2.display();
	}
}