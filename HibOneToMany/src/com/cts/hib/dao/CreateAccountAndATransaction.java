package com.cts.hib.dao;

import java.util.ArrayList;
import java.util.List;

public class CreateAccountAndATransaction {

	public static void main(String[] args) {
		AccountDao accountDao = null;
		try {
			System.out.println("\n Many to one \n");
			Department account = new Department();

			account.setDeptno("3890");
			account.setDeptname("Rajesh");
			
			employee accountTransaction = new employee();
			accountTransaction.setEid(2343214);
			accountTransaction.setEname("cse");
			

			List<employee> accountList = new ArrayList<employee>();
			accountList.add(accountTransaction);

			account.setListTransaction(accountList);
			
			
			accountDao = new AccountDao();
			accountDao.createAccountAndTransaction(account);
			
			//accountDao.createTransaction(accountTransaction);
			
			
			
			
			Department account1 = new Department();

			account1.setDeptno("38");
			account1.setDeptname("ffdgfd");
			
			employee accountTransaction1 = new employee();
			accountTransaction1.setEid(7834);
			accountTransaction1.setEname("ece");
			

			List<employee> accountList1 = new ArrayList<employee>();
			accountList1.add(accountTransaction1);

			account1.setListTransaction(accountList1);
			
			
			accountDao = new AccountDao();
			accountDao.createAccountAndTransaction(account1);
			
			
			
			
			
			
			


		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (accountDao != null) {
				accountDao.closeEntityManager();
			}
		}

	}

}
