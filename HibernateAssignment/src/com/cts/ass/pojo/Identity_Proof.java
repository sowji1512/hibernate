package com.cts.ass.pojo;
import javax.persistence.*;

@Entity
public class Identity_Proof {
	
@Id	
private long identityId;

private String typeId;
private String type;

@ManyToOne
private Employee employee;

public long getIdentityId() {
	return identityId;
}
public void setIdentityId(long identityId) {
	this.identityId = identityId;
}
public String getTypeId() {
	return typeId;
}
public void setTypeId(String typeId) {
	this.typeId = typeId;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
}

}
