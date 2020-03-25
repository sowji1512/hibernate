package com.cts.hib.dao;

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

	public Department saveAccount(Department account) {
		em.getTransaction().begin();
		em.persist(account);
		em.flush();
		em.getTransaction().commit();
		em.close();
		emf.close();
		return account;
	}
/*
	public Department getAccount(String accountNo) {
		Department account = null;
		try {
			account = em.find(Department.class, accountNo);
		} finally {
			em.close();
			emf.close();
		}

		return account;

	}

	public Department updateAccount(Department account) {
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

	public Department deleteAccount(Department account) {
		try {
			em.getTransaction().begin();
			// Account acc = em.find(Account.class, account.getAccountNo());
			Department fh = em.getReference(Department.class, account.getAccountNo());
			fh.getOutstandingBalance();
			em.remove(fh);
			em.getTransaction().commit();
		} finally {
			em.close();
			emf.close();
		}

		return account;

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

	}*/

	/*AccountTransaction getTransactionByTraId(int traId) {

		AccountTransaction accountTransaction = null;
		try {
			accountTransaction = getEntitymanager().find(AccountTransaction.class, traId);
		} finally {

		}

		return accountTransaction;

	}
	*/
	
	void createAccountAndTransaction(Department account){
		try {
			getEntitymanager();
			em.getTransaction().begin();
			em.persist(account);
			//em.flush();
			em.getTransaction().commit();
			em.close();
		} finally {

		}
	}
	
	
	void createTransaction(employee accountTransaction){
		try {
			getEntitymanager();
			em.getTransaction().begin();
			em.merge(accountTransaction);
			em.flush();
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
