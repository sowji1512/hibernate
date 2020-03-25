package com.manytoone.citi.dao;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.manytoone.citi.dao.Person;

public class Main2 {
   public static void main( String[ ] args ) {
   
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPAService" );
      EntityManager entitymanager = emfactory.createEntityManager();
      
      //Between
      Query query = entitymanager.createQuery( "Select e from Person e where e.id Between 1 and 3" );
      
      List<Person> list=(List<Person>)query.getResultList( );

      for( Person e:list ){
         System.out.print("Person ID :" + e.getId( ));
         System.out.println("\t Person name :" + e.getName( ));
      }

      //Like
      Query query1 = entitymanager.createQuery("Select e " + "from Person e " + "where e.name LIKE 'J%'");
      
      List<Person> list1=(List<Person>)query1.getResultList( );
      
      for( Person e:list1 ) {
         System.out.print("Person ID :"+e.getId( ));
         System.out.println("\t Person name :"+e.getName( ));
      }
   }
}