package com.cts.ass.service;


import java.util.ArrayList;
import java.util.List;

import com.cts.ass.dao.Dao;
import com.cts.ass.pojo.Employee;
import com.cts.ass.pojo.Employee_Vehicle;
import com.cts.ass.pojo.Identity_Proof;

public class Main {
	
	public static void main(String[] args) {
		
		
		
		Employee employee = new Employee();
		employee.setEid(765);
		employee.setEmploeeName("Sowjanya");
	
	
		Identity_Proof ip = new Identity_Proof();
		ip.setIdentityId(756);
		ip.setTypeId("805179745");
		ip.setType("Aadhar");
		ip.setEmployee(employee);
		
		Identity_Proof ip1 = new Identity_Proof();
		ip1.setIdentityId(865);
		ip1.setTypeId("5DEH82263");
		ip1.setType("PAN");
		ip1.setEmployee(employee);
		
		List<Identity_Proof> identityList=new ArrayList<Identity_Proof>();
		identityList.add(ip);
		identityList.add(ip1);
		
		
		Employee_Vehicle ev = new Employee_Vehicle();
		ev.setEmployeeVehicleId(26);
		ev.setEmployeeVehicleName("Bullet");
		ev.setEmployeeVehicleNum("AP14789");
		ev.setEmployee(employee);


		employee.setIdentityList(identityList);

		employee.setEV(ev);
		
		Dao dao=new Dao();
		dao.insertEmployee(employee);
		
		
		
		
	}
	
	
	
	
	
	

}
