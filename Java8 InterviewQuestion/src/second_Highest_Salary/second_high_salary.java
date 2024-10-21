package second_Highest_Salary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class second_high_salary {
public static void main(String[] args) {
	List<Employee>emp=Arrays.asList(
			new Employee("Mahesh", "Developer", 1l, "male"),
			new Employee("sham", "Developer", 2l, "male"),
			new Employee("ram", "Developer", 3l, "male"),
			new Employee("laxman", "Developer", 4l, "male"),
			new Employee("karn", "Developer", 5l, "male")
			
			);
	System.out.println("Highest Salary");
	emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
	.findFirst().ifPresent(s->System.out.println(s));
	//second Highest salary
	System.out.println("second Highest salary");
	emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
	.skip(1).findFirst().ifPresent(s->System.out.println(s));
	
	
	
	// if u want to highest salary
		System.out.println("highest salary");
	emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
	.skip(0).findFirst().ifPresent(s->System.out.println(s));
	
	
	//if u want to lowest salary 
	System.out.println("lowest salary ");
	emp.stream().sorted(Comparator.comparing(Employee::getSalary))
	.skip(0).findFirst().ifPresent(s->System.out.println(s));

	
	//second Lowest salary
	System.out.println("second Lowest salary");
	emp.stream().sorted(Comparator.comparing(Employee::getSalary))
	.skip(1).findFirst().ifPresent(s->System.out.println(s));
	
	
	
	
	

	}
}
