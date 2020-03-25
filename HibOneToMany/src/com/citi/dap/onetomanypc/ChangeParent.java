package com.citi.dap.onetomanypc;

public class ChangeParent {

	public static void main(String[] args) {
		AccountDao accountDao = null;
		try {
			System.out.println("\n Many to one \n");

			accountDao = new AccountDao();
			accountDao.changeParent(1, "101a");

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (accountDao != null) {
				accountDao.closeEntityManager();
			}
		}

	}

}
