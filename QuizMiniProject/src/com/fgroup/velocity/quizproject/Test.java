package com.fgroup.velocity.quizproject;

import java.sql.SQLException;


public class Test {
	public static void main(String[] args) throws SQLException {
		Quiz q = new Quiz();
		if (Examinee.attempt()) {
			q.getQuiz();
		}
	}

}
