package second_Highest_Salary1;

public class Employee {

	private int id;
	private String name;
	private String role;
	private int salary;
	private String department;
	public Employee(int id, String name, String role, int salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.salary = salary;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + ", salary=" + salary + ", department="
				+ department + "]";
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment(String department) {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
