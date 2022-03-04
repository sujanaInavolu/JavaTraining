package college;

import util.MyUtils;

public class ItClass {

	public static void main(String[] args) {
		Student[] students = new Student[2];
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student(MyUtils.readString("student name"), i + 1, "IT");
			int[] marks = { MyUtils.readInteger("marks"), MyUtils.readInteger("marks") };
			students[i].setMarks(marks);
		}
		for (int j = 0; j < students.length; j++) {
			System.out.println("Roll no: " + students[j].id + " Name : " + students[j].name + " Department: "
					+ students[j].department + " Percentage : " + students[j].getpercentage(students[j].marks)+"%");
		}
	}

}
