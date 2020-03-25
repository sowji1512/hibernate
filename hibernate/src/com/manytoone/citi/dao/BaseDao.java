package com.manytoone.citi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BaseDao {
	
	
	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAService");

	protected EntityManager em = null;

	protected EntityManager getEntitymanager() {
		if (em == null) {
			em = emf.createEntityManager();
		}

		return em;

	}
	
	public void closeEntityManager() {
		try {
			if (em != null) {
				em.close();
			}

		} catch (Exception e) {

		}
	}
}
