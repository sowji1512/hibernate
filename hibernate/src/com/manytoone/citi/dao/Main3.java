package com.manytoone.citi.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.manytoone.citi.dao.Person;

public class Main3 {
   public static void main( String[ ] args ) {
   
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPAService" );
      EntityManager entitymanager = emfactory.createEntityManager();
      Query query = entitymanager.createNamedQuery("find Person by id");
      
      query.setParameter("id", 2);
      List<Person> list = query.getResultList( );
      
      for( Person e:list ){
         System.out.print("Employee ID :" + e.getId( ));
         System.out.println("\t Employee Name :" + e.getName( ));
      }
   }
}