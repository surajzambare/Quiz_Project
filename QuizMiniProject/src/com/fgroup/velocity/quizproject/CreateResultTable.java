package com.fgroup.velocity.quizproject;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CreateResultTable {
	
	PreparedStatement ps = null;
	Connection con = null;
	
	public void createTable(String StudentName,int TotalMarks) {
		try {
			
			//	Calling the connection...
			DatabaseConnection connect = new DatabaseConnection();
			con = connect.getConnected();
			
			//	Preparing Statement(Query)...
			ps=con.prepareStatement("INSERT INTO result(StudentName,TotalMarks)VALUES(?,?)");
			ps.setString(1, StudentName);
			ps.setInt(2, TotalMarks);
			
			//	Executing query...
			ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
