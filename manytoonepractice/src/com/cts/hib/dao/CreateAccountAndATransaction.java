package com.cts.hib.dao;

import java.util.ArrayList;
import java.util.List;

public class CreateAccountAndATransaction {

	public static void main(String[] args) {
		AccountDao accountDao = null;
		try {
			System.out.println("\n Many to one \n");
			Department dept = new Department();

			dept.setDeptno("3890");
			dept.setDeptname("Rajesh");
			
			employee emp = new employee();
			emp.setEid(2343214);
			emp.setEname("cse");
			emp.setDept(dept);
			

			List<employee> empList = new ArrayList<employee>();
			empList.add(emp);

			dept.setListTransaction(empList);
			
			
			accountDao = new AccountDao();
			accountDao.createAccountAndTransaction(dept);
			
			
			
			
			
			Department dept1 = new Department();

			dept1.setDeptno("38");
			dept1.setDeptname("ffdgfd");
			
			employee emp1 = new employee();
			emp1.setEid(7834);
			emp1.setEname("ece");
			emp.setDept(dept1);

			

			List<employee> empList1 = new ArrayList<employee>();
			empList1.add(emp1);

			dept1.setListTransaction(empList1);
			
			
			accountDao = new AccountDao();
			accountDao.createAccountAndTransaction(dept1);
			
	
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (accountDao != null) {
				accountDao.closeEntityManager();
			}
		}

	}

}
