package college;

import util.MyUtils;

public class EmployeeClass {

	public static void main(String[] args) {
		Employee[] employee = new Employee[2];
		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee(MyUtils.readString("Employee Name"), (i + 1), "IT");
			int salary = MyUtils.readInteger("Salary");
			employee[i].setSalary(salary);
			int bonus = MyUtils.readInteger("Bonus");
			employee[i].setBonus(bonus);
		}
		for (int j = 0; j < employee.length; j++) {
			System.out.println("id : " + employee[j].id + " Employee Name : " + employee[j].name + " Department : "
					+ employee[j].department + " Takehome : " + (employee[j].getSalary() + employee[j].getBonus()));

		}

	}
}
