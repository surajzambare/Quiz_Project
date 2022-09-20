package com.fgroup.velocity.quizproject;

import java.util.Scanner;

public class GetResult {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("What You Want to See?");
		System.out.println("	Your Result		: Please Press 1");
		System.out.println("	All Student Result	: Please Press 2");
		Result r = new Result();
		System.out.print("	Your Response		: ");
		int press = sc.nextInt();
		System.out.println();
		System.out.println("---------------------------------------------");
		
		switch(press){
			case 1 : r.getMyResult();
					break;
			case 2 : r.getResult();
					break;
			default: System.out.println("Please Press 1 OR 2");
					break;
		}
	}

}
