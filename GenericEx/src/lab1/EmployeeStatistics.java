package lab1;

import java.util.List;

public class EmployeeStatistics {
		
	public static float calculateAvg(List<? extends Employee> employees) {
		float sum = 0;
		for (Employee employee : employees) {
			sum += employee.getSalary();
		}
		return sum / employees.size();
		
	}
		


}
