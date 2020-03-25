package com.citi.dap.onetomanypc;

public class DeleteAccount {

	public static void main(String[] args) {
		AccountDao accountDao = null;
		try {
			String accountNo="CITI101";
			accountDao.deleteAccount(accountNo);
			System.out.println("finished deletion ...");

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (accountDao != null) {
				accountDao.closeEntityManager();
			}
		}

	}

}
