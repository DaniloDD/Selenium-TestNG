package com.java.Recap_Java;

public class PracticeClass {

	public static void main (String[] args) {
		String[][] name = {
				{"D", "A", "N"},
				{"I", "L", "O"},
				{"D", "E", "I"},
				{"A", "N", "A"},
		};
		
		/*
		for (String[] row : name) {
			for (String s : row) {
				System.out.println(s);
			}
		}
		*/
		
		for (int i =0; i< name.length; i++) {
			for (int j = 0; j<name[i].length; j++) {
				System.out.println(name[i][j]);
			}
		}
	}
}
