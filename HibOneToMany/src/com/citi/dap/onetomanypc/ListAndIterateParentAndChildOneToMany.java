package com.citi.dap.onetomanypc;

import java.util.List;

public class ListAndIterateParentAndChildOneToMany {

	public static void main(String[] args) {
		AccountDao accountDao = null;
		try {
			accountDao = new AccountDao();
			List<Account> accountList = (List<Account>) accountDao.getAccountList();

			for (Account account : accountList) {
				System.out.println("Account Details :\n");
				System.out.println("\n Account number :" + account.getAccountNo());
				System.out.println("\n Account Holder name :" + account.getAccHoldername());
				System.out.println("\n OutStanding Amount :" + account.getOutstandingBalance());
				System.out.println("\n List of transaction \n");
				List<AccountTransaction> listTransaction = account.getListTransaction();

				if (listTransaction != null) {
					System.out.println("\n Length of transaction :" + listTransaction.size());

					for (AccountTransaction accountTransaction : listTransaction) {
						System.out.println("Account Transaction details Details :\n");
						System.out.println("\n Account number :" + accountTransaction.getTid());
						System.out.println("\n Account Holder name :" + accountTransaction.getAmount());
						System.out.println("\n OutStanding Amount :" + accountTransaction.getBeneficaryAccountNo());

					}

				} else {
					System.out.println("\n Length of transaction is null:");
				}

			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (accountDao != null) {
				accountDao.closeEntityManager();
			}
		}

	}

}
