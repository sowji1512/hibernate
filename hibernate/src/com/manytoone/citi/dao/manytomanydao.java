package com.manytoone.citi.dao;

import com.manytoone.citi.dao.PersonDaoImpl;

public class manytomanydao {

	public static void main(String[] args) {
		PersonDaoImpl personDaoImpl = null;
		try {
			personDaoImpl = new PersonDaoImpl();

			Department d1 = new Department();
			d1.setId(7L);
			d1.setName("Php");
			
			Department d2 = new Department();
			d2.setId(8L);
			d2.setName("html");
			personDaoImpl.createDepartment(d2);
			
			Department d3 = new Department();
			d3.setId(9L);
			d3.setName("Jsp");
			personDaoImpl.createDepartment(d3);


			Person p1 = new Person("yash");
			p1.setId(5L);
			p1.getDepartments().add(d1);

			Person p2 = new Person("Mark");
			p2.setId(6L);
			p2.getDepartments().add(d1);

			d1.getPersons().add(p1);
			d1.getPersons().add(p2);
			personDaoImpl.createDepartmentAndPerson(p1);
			personDaoImpl.createDepartmentAndPerson(p2);


		} finally {
			if (personDaoImpl != null) {
				personDaoImpl.closeEntityManager();
			}
		}

	}

}
