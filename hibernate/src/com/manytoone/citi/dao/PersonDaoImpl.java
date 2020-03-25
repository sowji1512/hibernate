package com.manytoone.citi.dao;


import com.manytoone.citi.dao.BaseDao;



public class PersonDaoImpl extends BaseDao {
	public void createDepartmentAndPerson(Person person) {

		getEntitymanager().getTransaction().begin();

		em.persist(person);

		em.getTransaction().commit();

	}
	
	
	
	public void createDepartment(Department department) {

		getEntitymanager().getTransaction().begin();

		em.persist(department);

		em.getTransaction().commit();

	}

}
