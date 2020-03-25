package com.citi.dap.onetomanypc;

import java.util.ArrayList;
import java.util.List;

public class CreateAccountAndATransaction {

	public static void main(String[] args) {
		AccountDao accountDao = null;
		try {
			System.out.println("\n Many to one \n");
			Account account = new Account();

			account.setAccountNo("336478");
			account.setAccHoldername("3rey53e");
			account.setOutstandingBalance(355);
			
			AccountTransaction accountTransaction = new AccountTransaction();
			accountTransaction.setTid(45689);
			accountTransaction.setBeneficaryAccountNo("24432");
			accountTransaction.setAmount(46546);
			
			AccountTransaction accountTransaction1 = new AccountTransaction();
			accountTransaction1.setTid(2536);
			accountTransaction1.setBeneficaryAccountNo("24432");
			accountTransaction1.setAmount(2);

			List<AccountTransaction> accountList = new ArrayList<AccountTransaction>();
			accountList.add(accountTransaction);
			accountList.add(accountTransaction1);

			account.setListTransaction(accountList);
			
			
			accountDao = new AccountDao();
			accountDao.createAccountAndTransaction(account);
			


		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (accountDao != null) {
				accountDao.closeEntityManager();
			}
		}

	}

}
