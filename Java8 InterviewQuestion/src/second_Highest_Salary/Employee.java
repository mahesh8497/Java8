package second_Highest_Salary;

public class Employee {
	private String name;
	public Employee(String name, String role, Long salary, String gender) {
		super();
		this.name = name;
		this.role = role;
		this.salary = salary;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", role=" + role + ", salary=" + salary + ", gender=" + gender + "]";
	}
	private String role;
	private Long salary;
	private String gender;
	

}
