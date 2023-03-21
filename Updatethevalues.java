package Crudoperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Updatethevalues {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Createthetable table=new Createthetable();
		table.setS_id(1);
		table.setS_name("Lester");
		table.setS_eid("lester@gmail.com");
		table.setS_ph(543632);
		
		transaction.begin();
		manager.merge(table);
		transaction.commit();
		System.out.println("Data has been updated successfully");
		
		
		
	}

}
