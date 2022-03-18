package collections;

import java.util.Arrays;

public class Student {
	int id;
	String name;
	String dept;
	long phno;
	String address;
	int[] marks;

	public Student(int id, String name, String dept, long phno) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.phno = phno;
	}

	public Student() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + ", phno=" + phno + ", address=" + address
				+ ", marks=" + Arrays.toString(marks) + "]";
	}

}
