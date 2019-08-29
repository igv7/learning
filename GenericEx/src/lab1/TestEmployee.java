package lab1;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {
		
//		List<Employee> employees = new ArrayList<>();
//		for (int i = 0; i <= 100; i++) {
//			employees.add(new Employee("first"+i, "last"+i, i, "department"+i));
//		}
//		float avg = EmployeeStatistics.calculateAvg(employees);
//		System.out.println(avg);
		
		
		
		
		List<Manager> employees = new ArrayList<>();
		for (int i = 0; i <= 100; i++) {
			employees.add(new Manager("first"+i, "last"+i, i, "department"+i));
		}
		float avg = EmployeeStatistics.calculateAvg(employees);
		System.out.println(avg);

	

	}

}
