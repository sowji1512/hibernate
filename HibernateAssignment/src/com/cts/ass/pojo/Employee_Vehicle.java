package com.cts.ass.pojo;

import javax.persistence.*;

@Entity
public class Employee_Vehicle {
	
	@Id
	private int employeeVehicleId;
    
	private String employeeVehicleName;
	
	private String employeeVehicleNum;
	
	
	@OneToOne
	private Employee employee;
	
	
	public int getEmployeeVehicleId() {
		return employeeVehicleId;
	}
	public void setEmployeeVehicleId(int i) {
		this.employeeVehicleId = i;
	}
	public String getEmployeeVehicleName() {
		return employeeVehicleName;
	}
	public void setEmployeeVehicleName(String employeeVehicleName) {
		this.employeeVehicleName = employeeVehicleName;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String getEmployeeVehicleNum() {
		return employeeVehicleNum;
	}
	public void setEmployeeVehicleNum(String employeeVehicleNum) {
		this.employeeVehicleNum = employeeVehicleNum;
	}

}
