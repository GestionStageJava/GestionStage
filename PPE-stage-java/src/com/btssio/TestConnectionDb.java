package com.btssio;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnectionDb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
		      Class.forName("org.postgresql.Driver");
		      System.out.println("Driver O.K.");

		      String url = "jdbc:postgresql://172.20.96.1:5432/dittierev";
		      String user = "dittierev";
		      String passwd = "@atme1997";

		      Connection conn = DriverManager.getConnection(url, user, passwd);
		      System.out.println("Connexion effective !");         

		    } catch (Exception e) {
		      e.printStackTrace();
		    }      
	}
}
