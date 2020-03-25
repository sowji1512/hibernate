package com.citi.dap.onetomanypc;

public class CreateAccountTransactionThatIsChild {

	public static void main(String[] args) {
		AccountDao accountDao = null;
		try {
			System.out.println("\n Many to one \n");
			
			
			AccountTransaction accountTransaction = new AccountTransaction();
			accountTransaction.setTid(13131);
			accountTransaction.setBeneficaryAccountNo("24432");
			accountTransaction.setAmount(46546);
			
			String accountNo="101a";
			accountDao = new AccountDao();
			accountDao.saveTransaction(accountTransaction,accountNo);


		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (accountDao != null) {
				accountDao.closeEntityManager();
			}
		}

	}
}
