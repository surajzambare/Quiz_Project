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
	static int queno = 1;
	
	//	No-Argument Constructor for calling methods of Class Quiz.
	Quiz(){
		
	}
	
	//-----------------------------------------------------------------------------------------//
	
	String question;

	//----------------------------------------------------------------------------------------//
	
	//	Creating parameterized constructor taking question as input for each Object creation.
	
	
	Quiz(String question){
		this.question=question;
	}
	
	
	
	//----------------------------------------------------------------------------------------//
	
	//	Creating method for question calling from database...
	
	@Override
	public String toString() {
		return "Question"+queno+": "+ question;
	}



	public void getQuiz() throws SQLException {
		
		try{
			DatabaseConnection connect = new DatabaseConnection();
			Connection  con = connect.getConnected();	//	Calling Connection from Database Connection.
			Statement s = con.createStatement();			//	To create Statement(Query) to retrieve data from table.
			ResultSet rs = null;						//	To get Result of Query.
		
		//	To store the result from ResultSet.
			String q = null, a=null, b=null, c=null, d=null;
			String que = null;
		
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
		//	Concatenation of Result to pass as parameter for object.
			que = q+"\n\tA: "+a+"\n\tB: "+b+"\n\tC: "+c+"\n\tD: "+d;
			
		//	Creating Object for First Question...
			
			Quiz q1 = new Quiz(que);
			
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
			que = q+"\n\tA: "+a+"\n\tB: "+b+"\n\tC: "+c+"\n\tD: "+d;
			
			Quiz q2 = new Quiz(que);
					
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
			que = q+"\n\tA: "+a+"\n\tB: "+b+"\n\tC: "+c+"\n\tD: "+d;
			
			Quiz q3 = new Quiz(que);
					
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
			que = q+"\n\tA: "+a+"\n\tB: "+b+"\n\tC: "+c+"\n\tD: "+d;
			
			Quiz q4 = new Quiz(que);
					
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
			que = q+"\n\tA: "+a+"\n\tB: "+b+"\n\tC: "+c+"\n\tD: "+d;
			
			Quiz q5 = new Quiz(que);
					
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
			que = q+"\n\tA: "+a+"\n\tB: "+b+"\n\tC: "+c+"\n\tD: "+d;
			
			Quiz q6 = new Quiz(que);
					
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
			que = q+"\n\tA: "+a+"\n\tB: "+b+"\n\tC: "+c+"\n\tD: "+d;
			
			Quiz q7 = new Quiz(que);
					
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
			que = q+"\n\tA: "+a+"\n\tB: "+b+"\n\tC: "+c+"\n\tD: "+d;
			
			Quiz q8 = new Quiz(que);
					
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
			que = q+"\n\tA: "+a+"\n\tB: "+b+"\n\tC: "+c+"\n\tD: "+d;
			
			Quiz q9 = new Quiz(que);
					
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
			
			que = q+"\n\tA: "+a+"\n\tB: "+b+"\n\tC: "+c+"\n\tD: "+d;
			
			Quiz q10 = new Quiz(que);
					
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
			
			HashMap<Quiz,String> hm = new HashMap<>();
					hm.put(q1, ans1);
					hm.put(q2, ans2);
					hm.put(q3, ans3);
					hm.put(q4, ans4);
					hm.put(q5, ans5);
					hm.put(q6, ans6);	
					hm.put(q7, ans7);
					hm.put(q8, ans8);
					hm.put(q9, ans9);
					hm.put(q10,ans10);
			
			for(Map.Entry<Quiz, String> map:hm.entrySet()) {
				System.out.println(map.getKey());
				queno++;
				
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
