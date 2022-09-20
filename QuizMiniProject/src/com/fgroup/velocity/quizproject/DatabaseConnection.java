package com.fgroup.velocity.quizproject;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	
	Connection con = null;
	
	public Connection getConnected() {
	
	try {
		
		//	Load Driver Class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//	Establish the Connection
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","@1ahemahem");
			
		}
	catch(Exception e){
		e.printStackTrace();
		}
	
		return con;
	}

}
