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
