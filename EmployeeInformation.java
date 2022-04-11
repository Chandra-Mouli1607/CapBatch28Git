package Test;

public class EmployeeInformation {
	private int empId;
	private String empName;
	private String empAddress;
	private double empSal;
	private String empDesignation;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public EmployeeInformation(int empId, String empName, String empAddress, double empSal, String empDesignation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empSal = empSal;
		this.empDesignation = empDesignation;
	}
	public EmployeeInformation() {
		// TODO Auto-generated constructor stub
		super();
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", empSal=" + empSal
				+ ", empDesignation=" + empDesignation + "]";
	}
	
	

}
