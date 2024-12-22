package com.cdac.labExam;

public class PrintNumbers {
	    public static void main(String[] args) {
	        // Loop to print five 4-digit numbers
	        for (int i = 0; i < 5; i++) {
	            // Generate a random 4-digit number between 1000 and 9999
	            int number = (int)(Math.random() * 9000) + 1000; 
	            // Print the 4-digit number
	            System.out.println(number);
	        }
	    }
	}


