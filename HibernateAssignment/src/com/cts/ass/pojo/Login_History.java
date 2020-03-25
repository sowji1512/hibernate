package com.cts.ass.pojo;
import javax.persistence.*;

@Entity

public class Login_History {
	@Id	
	private long LoginHistoryId;
	@ManyToOne
	private Employee employee;
	
	public long getLoginHistoryId() {
		return LoginHistoryId;
	}

	public void setLoginHistoryId(long loginHistoryId) {
		LoginHistoryId = loginHistoryId;
	}



	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}



}
