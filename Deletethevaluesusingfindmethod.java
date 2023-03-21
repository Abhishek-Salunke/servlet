package Crudoperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Deletethevaluesusingfindmethod {
	public static void main(String[] args) {
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=managerFactory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
	Createthetable createthetable=manager.find(Createthetable.class,2);
		
		
		
		transaction.begin();
		manager.remove(createthetable);
		transaction.commit();
		System.out.println("Data has been removed in second row");
	}

}
