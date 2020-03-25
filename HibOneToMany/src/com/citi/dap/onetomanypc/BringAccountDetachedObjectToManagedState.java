package com.citi.dap.onetomanypc;

public class BringAccountDetachedObjectToManagedState {

	
	public static void main(String[] args) {
		AccountDao accountDao = null;
		try {
			accountDao = new AccountDao();
			Account account = new Account();
			account.setAccountNo("101a");
			account.setAccHoldername("Kumar1");
			account.setOutstandingBalance(2300);
			accountDao.saveAccountDetachedOBject(account);
		} finally {
			if (accountDao != null) {
				accountDao.closeEntityManager();
			}
		}
	}

	
}
