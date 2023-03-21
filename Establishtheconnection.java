package Crudoperation;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Establishtheconnection {
	public static void main(String[] args) {
   EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
   System.out.println("connection has been established");
	}

}
