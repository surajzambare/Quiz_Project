package com.fgroup.velocity.quizproject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Result {
	
	String id;
	String name;
	String score;
	String count;
	int c;
	
	DatabaseConnection connect = new DatabaseConnection();
	Connection  con = connect.getConnected();	//	Calling Connection from Database Connection.
	
	public int getCount() {
		try{
			Statement s = con.createStatement();
			ResultSet rs = null;
			
			String studentcount = "Select count(*) from result";
			rs = s.executeQuery(studentcount);
			while(rs.next()) {
				count = rs.getString(1);
			}
			c = Integer.parseInt(count);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return c;
		
	}
	
	public void getResult() {
		try {
			
			
			Statement s = con.createStatement();			//	To create Statement(Query) to retrieve data from table.
			ResultSet rs = null;							//	To get Result of Query.
			
			System.out.println("id	|	name	|	score");
			
			for(int i=1;i<=getCount();i++) {
			
			String result = "select * from result where StudentID="+i;
			rs = s.executeQuery(result);
			while(rs.next()) {
				id = rs.getString(1);
				name = rs.getString(2);
				score = rs.getString(3);
			}
			
			System.out.println("---------------------------------------------");
			String res = id+"	|	"+name+"	|	"+score;
			System.out.println(res);
			
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void getMyResult() {
		
		try {

			Statement s = con.createStatement();			//	To create Statement(Query) to retrieve data from table.
			ResultSet rs = null;							//	To get Result of Query.
			
			
			
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.print("Please Enter Your StudentID : ");
			String myid = sc.nextLine();
			@SuppressWarnings("unused")
			int id = Integer.parseInt(myid);
			String result = "select * from result where StudentID="+myid;
			rs = s.executeQuery(result);
			while(rs.next()) {
				name = rs.getString(2);
				score = rs.getString(3);
			}
			
			System.out.println();
			System.out.println("-------------------Your Result------------------------");
			System.out.println();
			String res = "	StudentID	:	"+myid+"\n	Student Name	:	"+name+"\n	Your Score	:	"+score;
			System.out.println(res);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
