package com.citi.dao;

import java.util.List;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.citi.dao.departmentom;
import com.citi.dao.Employeeom;

public class OneToManyHib {
   public static void main(String[] args) {
   
   EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPAService" );
   EntityManager entitymanager = emfactory.createEntityManager( );
   entitymanager.getTransaction( ).begin( );

   Employeeom employee1 = new Employeeom();
   employee1.setEid(1);
   employee1.setEname("sai");
   employee1.setSalary(45000.0);
   employee1.setDeg("Technical Writer");

   Employeeom employee2 = new Employeeom();
   employee2.setEid(2);
   employee2.setEname("Kiran");
   employee2.setSalary(45000.0);
   employee2.setDeg("Technical Writer");

   Employeeom employee3 = new Employeeom();
   employee3.setEid(3);
   employee3.setEname("Manas");
   employee3.setSalary(50000.0);
   employee3.setDeg("Technical Writer");

   entitymanager.persist(employee1);
   entitymanager.persist(employee2);
   entitymanager.persist(employee3);

   List<Employeeom> emplist = new ArrayList();
   emplist.add(employee1);
   emplist.add(employee2);
   emplist.add(employee3);

   departmentom department = new departmentom();
   department.setId(1);
   department.setName("Development");
   department.setEmployeelist(emplist);
   

   entitymanager.persist(department);
   
     
   
   Employeeom employee4 = new Employeeom();
   employee4.setEid(4);

   employee4.setEname("ram");
   employee4.setSalary(8000.0);
   employee4.setDeg("Technical lead");

   Employeeom employee5 = new Employeeom();
   employee5.setEid(5);
   employee5.setEname("jai");
   employee5.setSalary(3000.0);
   employee5.setDeg("Technical lead");

   Employeeom employee6 = new Employeeom();
   employee6.setEid(6);
   employee6.setEname("Pearl");
   employee6.setSalary(4000.0);
   employee6.setDeg("Technical lead");

   entitymanager.persist(employee4);
   entitymanager.persist(employee5);
   entitymanager.persist(employee6);

   List<Employeeom> emplist2 = new ArrayList();
   emplist.add(employee4);
   emplist.add(employee5);
   emplist.add(employee6);

   departmentom department1 = new departmentom();
   department1.setId(2);
   department1.setName("Testing");
   department1.setEmployeelist(emplist2);

   entitymanager.persist(department1);
   
   
   
   
   
   
   
   																							
   entitymanager.getTransaction().commit();
   entitymanager.close();
   emfactory.close();
   }
}
