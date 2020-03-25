package com.citi.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.citi.dap.onetomanypc.Account;

@Entity
@Table(name="empotom")

public class Employeeom {

   @Id

   private int eid;
   private String ename;
   private double salary;
   

private String deg;
   @ManyToOne
	@JoinColumn(name="id")
	private departmentom department;

   

  
   public int getEid( ) {
      return eid;
   }
   
   public void setEid(int eid) {
      this.eid = eid;
   }

   public String getEname( ) {
      return ename;
   }
   
   public void setEname(String ename) {
      this.ename = ename;
   }

   public double getSalary( ) {
      return salary;
   }
   
   public void setSalary(double salary) {
      this.salary = salary;
   }

   public String getDeg( ) {
      return deg;
   }
   
   public void setDeg(String deg) {
      this.deg = deg;
   }
   public departmentom getDepartment() {
		return department;
	}

	public void setDepartment(departmentom department) {
		this.department = department;
	}
}
