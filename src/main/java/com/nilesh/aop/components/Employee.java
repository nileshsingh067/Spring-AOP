package com.nilesh.aop.components;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//aspect oriented programing
@Component//default singlton 
//@Scope(value="prototype")//create prototype
public class Employee {
	private int empId;
	private String empName;
	private String empDeg;
	private long mobileNo;
	private String email;
	@Autowired
	@Qualifier("lap067")
	private Laptop laptop;
	
	
	public Employee() {
		super();
		System.out.println("Employee object created");
	}
	public void getEmployee(String name) {
		System.out.println("Hello Employee : "+name);
	}
	public void show() {
		/*extra things like logs for calling method  writeLog()*/
		/*transaction start*/
		
		
		/*business logic start*/
		System.out.println("Hello Employee");
		laptop.compile();
		/*business logic end*/
		
		
		
		/*transaction commit*/
		/*extra things like logs for what method is returning*/
	}
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
	public String getEmpDeg() {
		return empDeg;
	}
	public void setEmpDeg(String empDeg) {
		this.empDeg = empDeg;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDeg=" + empDeg + ", mobileNo=" + mobileNo
				+ ", email=" + email + ", laptop=" + laptop + "]";
	}
	
	
	
	
}
