package Crudoperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class Deletetheentirerowbyusingqueryinterface {
	public static void main(String[] args) {
      EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("dev");
      EntityManager manager=managerFactory.createEntityManager();
      EntityTransaction transaction=manager.getTransaction();
      
               Query query=manager.createQuery("delete from students");
               transaction.begin();
               query.executeUpdate();
               transaction.commit();
               System.out.println("Entire rows has removed successfully deleted");
               
	}

}
