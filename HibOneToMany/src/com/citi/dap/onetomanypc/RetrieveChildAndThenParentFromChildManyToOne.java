package com.citi.dap.onetomanypc;

public class RetrieveChildAndThenParentFromChildManyToOne {

	public static void main(String[] args) {
		AccountDao accountDao = null;
		try {
			System.out.println("\n Many to one \n");

			accountDao = new AccountDao();
			AccountTransaction accountTransaction = accountDao.getTransactionByTraId(1);

			System.out.println("Account Transaction details Details :\n");
			System.out.println("\n Account number :" + accountTransaction.getTid());
			System.out.println("\n Account Holder name :" + accountTransaction.getAmount());
			System.out.println("\n OutStanding Amount :" + accountTransaction.getBeneficaryAccountNo());
			
			System.out.println("\n Account Details... \n");			
			Account account = accountTransaction.getAccount();
			System.out.println("\n Account number :" + account.getAccountNo());
			System.out.println("\n Account Holder name :" + account.getAccHoldername());
			System.out.println("\n OutStanding OutstandingBalance :" + account.getOutstandingBalance());
			
		} catch(Exception e){
			e.printStackTrace();
			
		}
		finally {
			if(accountDao!=null){
			accountDao.closeEntityManager();
			}
		}

	}

}
