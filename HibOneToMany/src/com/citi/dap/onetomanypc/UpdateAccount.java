package com.citi.dap.onetomanypc;

public class UpdateAccount {

	public static void main(String[] args) {
		AccountDao accountDao = null;
		try {

			Account account = new Account();
			account.setAccountNo("CITI101");
			account.setOutstandingBalance(3000);

			accountDao.updateAccount(account);
			System.out.println("finished updation ...");

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (accountDao != null) {
				accountDao.closeEntityManager();
			}
		}

	}

}
