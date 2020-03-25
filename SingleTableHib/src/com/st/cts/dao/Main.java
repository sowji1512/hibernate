package com.st.cts.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.st.cts.dao.NonTeachingStaff;
import com.st.cts.dao.TeachingStaff;

public class Main {

   public static void main( String[ ] args ) {
   
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPAService" );
      EntityManager entitymanager = emfactory.createEntityManager( );
      entitymanager.getTransaction( ).begin( );

      //Teaching staff entity 
      TeachingStaff ts1=new TeachingStaff(1,"Sowji","Btech","Cse");
      TeachingStaff ts2=new TeachingStaff(2, "Manisha", "BE", "ECE");
      
      //Non-Teaching Staff entity
      NonTeachingStaff nts1=new NonTeachingStaff(3, "Sai", "Accounts");
      NonTeachingStaff nts2=new NonTeachingStaff(4, "ram", "Office Admin");

      //storing all entities
      entitymanager.persist(ts1);
      entitymanager.persist(ts2);
      entitymanager.persist(nts1);
      entitymanager.persist(nts2);
      
      entitymanager.getTransaction().commit();
      
      entitymanager.close();
      emfactory.close();
   }
}