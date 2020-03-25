package com.cts.ass.pojo;

import java.util.List;

import javax.persistence.*;

@Entity
public class Employee {
	
	@Id
	private long Eid;
    
	private String EmploeeName;
	
	@OneToMany(mappedBy = "employee",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<Identity_Proof> identityList;
	
	@OneToOne(mappedBy = "employee",fetch = FetchType.EAGER,cascade = CascadeType.ALL)

	private Employee_Vehicle EV;
	
	public long getEid() {
		return Eid;
	}
	public void setEid(long eid) {
		Eid = eid;
	}
	public String getEmploeeName() {
		return EmploeeName;
	}
	public void setEmploeeName(String emploeeName) {
		EmploeeName = emploeeName;
	}
	public List<Identity_Proof> getIdentityList() {
		return identityList;
	}
	public void setIdentityList(List<Identity_Proof> identityList) {
		this.identityList = identityList;
	}
	public Employee_Vehicle getEV() {
		return EV;
	}
	public void setEV(Employee_Vehicle eV) {
		EV = eV;
	}

}















