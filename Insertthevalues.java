package Crudoperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insertthevalues {
	public static void main(String[] args) {
	EntityManagerFactory  managerFactory	=Persistence.createEntityManagerFactory("dev");
	EntityManager    manager=managerFactory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	
	    Createthetable      createthetable =new Createthetable();
	            createthetable.setS_id(4);
	            createthetable.setS_name("Rahul");
	            createthetable.setS_eid("rahulgmail.com");
	            createthetable.setS_ph(868565354);
	
	
	transaction.begin();
	manager.persist(createthetable);
	transaction.commit();
	System.out.println("data has inserted successfully");
	}

}
