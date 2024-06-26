package basic.ch12;

public class Employee {
	private int employeeId;
	private String name;
	private String department;
	
	//사원이 존재하게 될 떄마다 고유한 사원 번호를
	//하리당하고 싶다. 단 사원 번호는 중복 되어서는 안된다.
	//static 과 멤버 변수에 활용
	
	public Employee(String name) {
		this.name = name;
		this.employeeId = Company.empSerialNumber;
		Company.empSerialNumber++;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}
