package lab1;

public class Employee {
	
	private String first;
	private String last;
	private float salary;
	private String department;
	
	public Employee() {
		
	}
	
	public Employee(String first, String last, float salary, String department) {
		super();
		this.first = first;
		this.last = last;
		this.salary = salary;
		this.department = department;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [first=" + first + ", last=" + last + ", salary=" + salary + ", department=" + department
				+ "]";
	}
	
	

}
