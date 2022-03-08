package college;

import util.MyUtils;

public class ItClass {

	public static void main(String[] args) {
		Student[] students = new Student[2];
		int[] numbers = new int[5];
		Student s1 = new Student("krishna", 11, "dept");
		System.out.println("name : " + s1.name);
		System.out.println("roll : " + s1.id);
		System.out.println("dept : " + s1.department);
		Student s2 = new Student("krishna", 12, "dept");
		Student s3 = new Student();
		s3.setName("sujana");
		System.out.println("name : " + s3.name);
		System.out.println("dept : " + s3.department);
		Student s4 = new Student(111,"suji");
		
		/*
		 * for (int i = 0; i < students.length; i++) { students[i] = new
		 * Student(MyUtils.readString("student name"), i + 1, "IT"); int[] marks = {
		 * MyUtils.readInteger("marks"), MyUtils.readInteger("marks") };
		 * students[i].setMarks(marks); } for (int j = 0; j < students.length; j++) {
		 * System.out.println("Roll no: " + students[j].id + " Name : " +
		 * students[j].name + " Department: " + students[j].department +
		 * " Percentage : " + students[j].getpercentage(students[j].marks) + "%"); }
		 */
	}

}
