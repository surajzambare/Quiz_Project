package com.fgroup.velocity.quizproject;


import java.util.Scanner;

public class Examinee extends CreateResultTable{
	
	static boolean response = false;
	
	static String name;
	static char ready;
	int marks = Quiz.markscounter;
		
	public static boolean attempt() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("--------------------------Java Quiz-------------------------");
		System.out.print("	Enter Your name:  ");
		name = sc.nextLine();
		System.out.println("	Are You Ready...!");
		System.out.print("	Your Answer(Y/N):  ");
		ready = sc.nextLine().charAt(0);
		if(ready=='Y'||ready=='y') {
			System.out.println();
			System.out.println("		Your StudentID is generated.");
			System.out.println();
			System.out.println("--------------------Submit Your Answers---------------------");
			System.out.println();
			response=true;
			
		}else {
			System.out.println();
			System.out.println("		To attempt Quiz, Please Answer Y");
		}
		
		return response;
	}
	
	public void setRecord() {
		if(response==true) {
			Examinee e = new Examinee();
			e.createTable(name, marks);
		}
	}
}
