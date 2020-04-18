package Models;


/**
 * @author anthony_sampath
 *
 */
public class Employee {

	private int empId;
	private String name;
	private String mobile;
	private long salary;
	public Employee() {
		super();
	}

	private String email;

	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * @return the salary
	 */
	public long getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Employee(int empId, String name, String mobile, long salary, String email) {
		super();
		this.empId = empId;
		this.name = name;
		this.mobile = mobile;
		this.salary = salary;
		this.email = email;
	}

	/**
	 * @param empId
	 *            the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile
	 *            the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public Employee(int empId, String name, String mobile, String email) {
		super();
		this.empId = empId;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", mobile=" + mobile + ", salary=" + salary + ", email="
				+ email + "]";
	}

}

