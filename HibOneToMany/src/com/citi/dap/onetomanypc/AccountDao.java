package com.citi.dap.onetomanypc;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AccountDao {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAService");
	private EntityManager em = null;

	EntityManager getEntitymanager() {
		if (em == null) {
			em = emf.createEntityManager();
		}

		return em;

	}

	public Account saveAccount(Account account) {
		getEntitymanager().getTransaction().begin();
		em.persist(account);
		em.getTransaction().commit();
		return account;
	}

	public Account saveAccountDetachedOBject(Account account) {
		getEntitymanager().getTransaction().begin();
		em.merge(account);
		// pull data by find is right way to update
		em.getTransaction().commit();
		return account;
	}

	public Account getAccount(String accountNo) {
		Account account = null;
		try {
			account = getEntitymanager().find(Account.class, accountNo);
		} finally {
		}

		return account;

	}

	public Account updateAccount(Account account) {
		try {
			getEntitymanager().getTransaction().begin();
			Account acc = em.find(Account.class, account.getAccountNo());
			acc.setOutstandingBalance(account.getOutstandingBalance());
			em.getTransaction().commit();
			// or else you can use merge
			// making detached object to managed state
		} finally {
		}

		return account;

	}

	public void deleteAccount(String accountNo) {
		try {
			getEntitymanager().getTransaction().begin();
			// Account acc = em.find(Account.class, accountNo);
			Account a = em.getReference(Account.class, accountNo);
			em.remove(a);
			em.getTransaction().commit();
		} finally {
		}

	}

	public List<Account> getAccountList() {
		List<Account> accountList = null;
		try {
			Query query = getEntitymanager().createQuery(" from Account");
			accountList = query.getResultList();
			System.out.println(accountList.size());
		} finally {
		}

		return accountList;

	}

	void changeParent(int traId, String accountNo) {

		AccountTransaction accountTransaction = null;
		try {
			getEntitymanager().getTransaction().begin();
			accountTransaction = getEntitymanager().find(AccountTransaction.class, traId);
			Account a = em.getReference(Account.class, accountNo);
			accountTransaction.setAccount(a);
			em.getTransaction().commit();
		} finally {

		}

	}

	AccountTransaction getTransactionByTraId(int traId) {

		AccountTransaction accountTransaction = null;
		try {
			accountTransaction = getEntitymanager().find(AccountTransaction.class, traId);
		} finally {

		}

		return accountTransaction;

	}

	void createAccountAndTransaction(Account account) {
		try {
			getEntitymanager();
			em.getTransaction().begin();
			em.persist(account);
			em.getTransaction().commit();
			em.close();
		} finally {

		}
	}

	void saveTransaction(AccountTransaction accountTransaction, String accountNo) {
		try {
			getEntitymanager();
			em.getTransaction().begin();
			Account account = em.getReference(Account.class, accountNo);
			accountTransaction.setAccount(account);
			em.persist(accountTransaction);
			em.getTransaction().commit();
			em.close();
		} finally {

		}
	}

	void closeEntityManager() {
		try {
			if (em != null) {
				em.close();
			}

		} catch (Exception e) {

		}
	}

}
