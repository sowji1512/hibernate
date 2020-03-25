package com.manytoone.citi.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main {
   public static void main( String[ ] args ) {
   
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPAService" );
      EntityManager entitymanager = emfactory.createEntityManager();

      //Scalar function
      Query query = entitymanager.
      createQuery("Select e.city from User e");
      List<String> list = query.getResultList();

      for(String e:list) {
         System.out.println("City NAME :"+e);
      }
      
      Query query1 = entitymanager.createQuery("Select MAX(e.phone) from User e");
      Object result = query1.getSingleResult();
      System.out.println("Max :" + result);
      
     /* //Aggregate function
      Query query1 = entitymanager.createQuery("Select count(e.id) from User e");
      int result = (int) query1.getSingleResult();
      System.out.println("Count of Employees :" + result);*/
   }
}