package com.fgroup.velocity.quizproject;

import java.util.Scanner;

public class Score {
	
	public static void getScore() {
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("		Congratulations "+Examinee.name+" ! You have Succefully attended the Test.");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Do You Want to See the Result (Y/N)?	");
		char see = sc.next().charAt(0);
		System.out.println();
		if(see=='y'||see=='Y') {
			Result r = new Result();
			System.out.println("	StudentID	:	"+(r.getCount()+1));
			System.out.println("	Student Name	:	"+Examinee.name);
			System.out.println("	Your Marks	:	"+Quiz.markscounter);
			if(Quiz.markscounter>=8) {
				System.out.println("	Your Grade	:	A");
			}else if(Quiz.markscounter>=6 && Quiz.markscounter<8) {
				System.out.println("	Your Grade	:	B");
			}else if(Quiz.markscounter==5) {
				System.out.println("	Your Grade	:	C");
			}else {
				System.out.println();
				System.out.println("	You Have Failed !!!");
				System.out.println("	Koi Baat Nahi...Better Luck Next Time.");
			}
		}
		
	}

}
