package com.citi.dao.onetomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AccountDao {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAService");
	static EntityManager em = emf.createEntityManager();

	public Account saveAccount(Account account) {
		em.persist(account);
		em.flush();
		
		return account;

	}

	public Account getAccount(String accountNo) {
		Account account = null;
		try {
			account = em.find(Account.class, accountNo);
		} finally {
			em.close();
			emf.close();
		}

		return account;

	}

	public Account updateAccount(Account account) {
		try {
			em.getTransaction().begin();
			Account acc = em.find(Account.class, account.getAccountNo());
			acc.setOutstandingBalance(account.getOutstandingBalance());
			em.getTransaction().commit();
		} finally {
			em.close();
			emf.close();
		}

		return account;

	}

	public Account deleteAccount(Account account) {
		try {
			em.getTransaction().begin();
			// Account acc = em.find(Account.class, account.getAccountNo());
			Account fh = em.getReference(Account.class, account.getAccountNo());
			fh.getOutstandingBalance();
			em.remove(fh);
			em.getTransaction().commit();
		} finally {
			em.close();
			emf.close();
		}

		return account;

	}
	
	public void getAccountTransaction(Account acc) {
		em.getTransaction().begin();
		List listTransaction=acc.getListTransaction();
		System.out.println(((AccountTransaction)listTransaction.get(0)).getTid());
		em.getTransaction().commit();
		em.close();
		emf.close();
		
	}

	public List<Account> getAccountList() {
		List<Account> accountList = null;
		try {
			Query query = em.createQuery(" from Account");
			accountList = query.getResultList();

		} finally {
			
		}

		return accountList;

	}

}
