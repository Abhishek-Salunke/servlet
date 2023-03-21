package Crudoperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetchthevaluebyusingfindmethod {
	public static void main(String[] args) {
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=managerFactory.createEntityManager();
	Createthetable createthetable=	manager.find(Createthetable.class,1);
	System.out.println("s_id"+" "+createthetable.getS_id()+" "+"s_name"+createthetable.getS_name()+"s_eid"+" "+createthetable.getS_eid()+" "+"s_ph"+" "+createthetable.getS_ph());
	}

}
