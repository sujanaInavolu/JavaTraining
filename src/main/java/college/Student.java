package college;

public class Student {
	String name;
	int id;
	String department;
	int[] marks;

	public float getpercentage(int[] marks) {
		int total = 0;
		for (int i = 0; i < marks.length; i++) {
			total = total + marks[i];
		}
		return (total / marks.length);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public Student(String name, int id, String department) {
		super();
		this.name = name;
		this.id = id;
		this.department = department;
	}

	public Student(int id, String name) {
		super(); 
		this.name = name;
		this.id = id;
	}

	public Student() {

	}
}
