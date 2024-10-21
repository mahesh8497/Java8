package second_Highest_Salary1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Launch {
public static void main(String[] args) {
	List<Employee>emp=Arrays.asList(
			new Employee(1, "sham", "developer", 2343111, "Engineering"),
			new Employee(2, "shara", "QA", 2443111, "Engineering"),
			new Employee(3, "shamp", "Testing", 2543111, "Engineering"),
			new Employee(4, "m", "Devops", 2643111, "Engineering"),
			new Employee(5, "am", "developer", 2743111, "Engineering"),
			new Employee(6, "ram", "developer", 2843111, "Engineering"),
			new Employee(7, "mahesh", "developer", 2943111, "Engineering")
			
			);
	emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
	.skip(1).findFirst()
	.ifPresent(s->System.out.println(s));
}
}
