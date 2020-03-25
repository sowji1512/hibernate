package com.hib.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.HibernateException;
 
import com.hib.dao.User;
 
public class User1Dao {
 
    public void addUserDetails(String userName, String password, String email,
            String phone, String city) {
        try {
  
        	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPAService" );

        	   EntityManager entitymanager = emfactory.createEntityManager( );

        	   entitymanager.getTransaction( ).begin( );

 
            User user = new User();
            user.setUserName(userName);
            user.setPassword1(password);
            user.setEmail(email);
            user.setCity(city);
            user.setPhone(phone);
            
            
            entitymanager.persist(user);
            
                       
				
            entitymanager.getTransaction().commit();
            entitymanager.close();
            emfactory.close();
            System.out.println("\n\n Details Added \n");
 
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            System.out.println("error");
        }
 
    }
 
}
