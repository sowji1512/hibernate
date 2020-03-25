package com.citi.dap.onetomanypc;

public class CreateAccount {

	public static void main(String[] args) {
		AccountDao accountDao = null;
		try {
			accountDao = new AccountDao();
			Account account = new Account();
			account.setAccountNo("CITI103");
			account.setAccHoldername("Kumar");
			account.setOutstandingBalance(2300);
			accountDao.saveAccount(account);
		} finally {
			if (accountDao != null) {
				accountDao.closeEntityManager();
			}
		}
	}

}
