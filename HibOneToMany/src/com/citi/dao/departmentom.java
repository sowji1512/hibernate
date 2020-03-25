package com.citi.dao;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.citi.dap.onetomanypc.Account;

@Entity
@Table(name="deptotom")
public class departmentom {

    @Id 
    
    private int id;
    private String name;
    
    @OneToMany(mappedBy = "department", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
 	private List employeelist;

    public int getId() {
    	return id;
    }
    
    public void setId(int id) {
    	this.id = id;
    }
    
    public String getName( ) {
    	return name;
    }
    
    public void setName( String deptName ) {
    	this.name = deptName;
    }

    public List getEmployeelist() {
      return employeelist;
    }

   public void setEmployeelist(List employeelist) {
      this.employeelist = employeelist;
   }
  
}