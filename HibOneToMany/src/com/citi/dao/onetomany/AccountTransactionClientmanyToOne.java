package com.citi.dao.onetomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AccountTransactionClientmanyToOne {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAService");
	static EntityManager em = emf.createEntityManager();
	public static void main(String[] args) {
		System.out.println("\n AccountTransactionClientmanyToOne \n");
		em.getTransaction().begin();

		AccountDao accountDao = new AccountDao();
		List<Account> accountList = (List<Account>) accountDao.getAccountList();

		for (Account account : accountList) {
			System.out.println("Account Details :\n");
			System.out.println("\n Account number :" + account.getAccountNo());
			System.out.println("\n Account Holder name :" + account.getAccHoldername());
			System.out.println("\n OutStanding Amount :" + account.getOutstandingBalance());

			System.out.println("\n List of transaction \n");

			accountDao.getAccountTransaction(account);			
			
			

		

		}
		
	}
}


