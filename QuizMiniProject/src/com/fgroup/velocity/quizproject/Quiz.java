package com.fgroup.velocity.quizproject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quiz {
	
	static int markscounter=0;

	public void getQuiz() throws SQLException {
		
		try{
			DatabaseConnection connect = new DatabaseConnection();
			Connection  con = connect.getConnected();	//	Calling Connection from Database Connection.
			Statement s = con.createStatement();			//	To create Statement(Query) to retrieve data from table.
			ResultSet rs = null;						//	To get Result of Query.
		
		//	To store the result from ResultSet.
			String q = null, a=null, b=null, c=null, d=null;
		
		//	Getting Questions...
		
		//	Selecting Question from Database Quiz Table using index.
			String question1 = "Select * from quiz where No=1";
		
		//	Executing Query - Getting the ResultSet
			rs = s.executeQuery(question1);
		
		//	Storing ResultSet into Variables...
			while(rs.next()) {
				q=rs.getString("Question");
				a=rs.getString("OptionA");
				b=rs.getString("OptionB");
				c=rs.getString("OptionC");
				d=rs.getString("OptionD");
			}
			String que1 = "Question : "+q+"\n\tA: "+a+"\n\tB: "+b+"\n\tC: "+c+"\n\tD: "+d;
			
		//-----------------------------------------------------------//
			
			String question2 = "Select * from quiz where No=2";
			rs = s.executeQuery(question2);
			while(rs.next()) {
				q=rs.getString("Question");
				a=rs.getString("OptionA");
				b=rs.getString("OptionB");
				c=rs.getString("OptionC");
				d=rs.getString("OptionD");
				}
			String que2 = "Question : "+q+"\n\tA: "+a+"\n\tB: "+b+"\n\tC: "+c+"\n\tD: "+d;
					
		//-----------------------------------------------------------//
			
			String question3 = "Select * from quiz where No=3";
			rs = s.executeQuery(question3);
			while(rs.next()) {
				q=rs.getString("Question");
				a=rs.getString("OptionA");
				b=rs.getString("OptionB");
				c=rs.getString("OptionC");
				d=rs.getString("OptionD");
				}
			String que3 = "Question : "+q+"\n\tA: "+a+"\n\tB: "+b+"\n\tC: "+c+"\n\tD: "+d;
					
		//-----------------------------------------------------------//
			
			String question4 = "Select * from quiz where No=4";
			rs = s.executeQuery(question4);
			while(rs.next()) {
				q=rs.getString("Question");
				a=rs.getString("OptionA");
				b=rs.getString("OptionB");
				c=rs.getString("OptionC");
				d=rs.getString("OptionD");
				}
			String que4 = "Question : "+q+"\n\tA: "+a+"\n\tB: "+b+"\n\tC: "+c+"\n\tD: "+d;
					
		//-----------------------------------------------------------//
			
			String question5 = "Select * from quiz where No=5";
			rs = s.executeQuery(question5);
			while(rs.next()) {
				q=rs.getString("Question");
				a=rs.getString("OptionA");
				b=rs.getString("OptionB");
				c=rs.getString("OptionC");
				d=rs.getString("OptionD");
				}
			String que5 = "Question : "+q+"\n\tA: "+a+"\n\tB: "+b+"\n\tC: "+c+"\n\tD: "+d;
					
		//-----------------------------------------------------------//
			
			String question6 = "Select * from quiz where No=6";
			rs = s.executeQuery(question6);
			while(rs.next()) {
				q=rs.getString("Question");
				a=rs.getString("OptionA");
				b=rs.getString("OptionB");
				c=rs.getString("OptionC");
				d=rs.getString("OptionD");
				}
			String que6 = "Question : "+q+"\n\tA: "+a+"\n\tB: "+b+"\n\tC: "+c+"\n\tD: "+d;
					
		//-----------------------------------------------------------//
			
			String question7 = "Select * from quiz where No=7";
			rs = s.executeQuery(question7);
			while(rs.next()) {
				q=rs.getString("Question");
				a=rs.getString("OptionA");
				b=rs.getString("OptionB");
				c=rs.getString("OptionC");
				d=rs.getString("OptionD");
				}
			String que7 = "Question : "+q+"\n\tA: "+a+"\n\tB: "+b+"\n\tC: "+c+"\n\tD: "+d;
					
		//-----------------------------------------------------------//
			
			String question8 = "Select * from quiz where No=8";
			rs = s.executeQuery(question8);
			while(rs.next()) {
				q=rs.getString("Question");
				a=rs.getString("OptionA");
				b=rs.getString("OptionB");
				c=rs.getString("OptionC");
				d=rs.getString("OptionD");
				}
			String que8 = "Question : "+q+"\n\tA: "+a+"\n\tB: "+b+"\n\tC: "+c+"\n\tD: "+d;
					
		//-----------------------------------------------------------//
			
			String question9 = "Select * from quiz where No=9";
			rs = s.executeQuery(question9);
			while(rs.next()) {
				q=rs.getString("Question");
				a=rs.getString("OptionA");
				b=rs.getString("OptionB");
				c=rs.getString("OptionC");
				d=rs.getString("OptionD");
				}
			String que9 = "Question : "+q+"\n\tA: "+a+"\n\tB: "+b+"\n\tC: "+c+"\n\tD: "+d;

					
		//-----------------------------------------------------------//
			
			String question10 = "Select * from quiz where No=10";
			rs = s.executeQuery(question10);
			while(rs.next()) {
				q=rs.getString("Question");
				a=rs.getString("OptionA");
				b=rs.getString("OptionB");
				c=rs.getString("OptionC");
				d=rs.getString("OptionD");
				}
			
			String que10 = "Question : "+q+"\n\tA: "+a+"\n\tB: "+b+"\n\tC: "+c+"\n\tD: "+d;

		//-----------------------------------------------------------//
			
		//	To get The Answers from Table...
			String answer = "Select Answer from quiz where No=1";
			rs = s.executeQuery(answer);
			rs.next();
			String ans1=rs.getString("Answer");
			answer = "Select Answer from quiz where No=2";
			rs = s.executeQuery(answer);
			rs.next();
			String ans2=rs.getString("Answer");
			answer = "Select Answer from quiz where No=3";
			rs = s.executeQuery(answer);
			rs.next();
			String ans3=rs.getString("Answer");
			answer = "Select Answer from quiz where No=4";
			rs = s.executeQuery(answer);
			rs.next();
			String ans4=rs.getString("Answer");
			answer = "Select Answer from quiz where No=5";
			rs = s.executeQuery(answer);
			rs.next();
			String ans5=rs.getString("Answer");
			answer = "Select Answer from quiz where No=6";
			rs = s.executeQuery(answer);
			rs.next();
			String ans6=rs.getString("Answer");
			answer = "Select Answer from quiz where No=7";
			rs = s.executeQuery(answer);
			rs.next();
			String ans7=rs.getString("Answer");
			answer = "Select Answer from quiz where No=8";
			rs = s.executeQuery(answer);
			rs.next();
			String ans8=rs.getString("Answer");
			answer = "Select Answer from quiz where No=9";
			rs = s.executeQuery(answer);
			rs.next();
			String ans9=rs.getString("Answer");
			answer = "Select Answer from quiz where No=10";
			rs = s.executeQuery(answer);
			rs.next();
			String ans10=rs.getString("Answer");
			
			
		//	Create HashMap Object...
			//	Why HashMap ? => Because	1.Both question and answer will be stored as Key-Value pair.
			//								2.It will automatically shuffles question Every-time(Insertion Order not preserved.)	
			
			//	To Store Question as Key ->	Because it Cannot be Duplicate.
			//	To Store Answers as Value->	Because it can be duplicates.
			
			HashMap<String,String> hm = new HashMap<>();
					hm.put(que1, ans1);
					hm.put(que2, ans2);
					hm.put(que3, ans3);
					hm.put(que4, ans4);
					hm.put(que5, ans5);
					hm.put(que6, ans6);	
					hm.put(que7, ans7);
					hm.put(que8, ans8);
					hm.put(que9, ans9);
					hm.put(que10,ans10);
			
			for(Map.Entry<String, String> map:hm.entrySet()) {
				System.out.println(map.getKey());
				
				
			//	Take Answer as Input...
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				System.out.println();
				System.out.print("Enter Your Answer: ");
				@SuppressWarnings("unused")
				String ans = sc.next();
				System.out.println();
				
				boolean check = ans.equalsIgnoreCase(map.getValue());
				
				
				if(check==true) {
					markscounter++;
				}
				
			}
			
			Score.getScore();
			Examinee ex = new Examinee();
			ex.setRecord();
			
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
