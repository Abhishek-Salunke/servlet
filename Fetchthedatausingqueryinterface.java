package Crudoperation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class Fetchthedatausingqueryinterface {
	public static void main(String[] args) {
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=managerFactory.createEntityManager();
	Query query=manager.createQuery("select x from students x",Createthetable.class);
	List<Createthetable> list=query.getResultList();
	for(Createthetable createthetable:list) {
		System.out.println("s_id:"+" "+createthetable.getS_id()+" "+"s_name:"+createthetable.getS_name()+"s_eid:"+" "+createthetable.getS_eid()+" "+"s_ph:"+" "+createthetable.getS_ph());
	}
	}

}
