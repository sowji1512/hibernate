package com.cts.ass.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cts.ass.pojo.Employee;
import com.cts.ass.pojo.Identity_Proof;

public class Dao{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAService");
	EntityManager em = emf.createEntityManager();
	
	
	public void insertEmployee(Employee employee)
	{
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
	public void insertIdentity(Identity_Proof iproof){
		em.getTransaction().begin();
		em.persist(iproof);
		em.getTransaction().commit();
		em.close();
	}
	
	
	

}