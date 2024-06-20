 package com.org;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to student grade calculator");
		System.out.println("Enter Number of subject");
		int noOfSubject=sc.nextInt();
		int total=0;
		for(int i=1;i<=noOfSubject;i++) {
			System.out.println("Enter marks obtained in subject "+i+":");
			int mark=sc.nextInt();
			total+=mark;
			
		}
		
		double averagePercentage=(double)total/noOfSubject;
		char grade;
		if(averagePercentage>=90) {
			grade='O';
		}
		else if(averagePercentage>=80) {
			grade='A';
		}
		else if(averagePercentage>=70) {
			grade='B';
		}
		else if(averagePercentage>=60) {
			grade='C';
		}
		else if(averagePercentage>=50) {
			grade='D';
		}
		else if(averagePercentage>=33) {
			grade='E';
		}
		else {
			grade='F';
		}
		System.out.println("Your total marks is :"+total);
		System.out.println("Average percentage gained is :"+averagePercentage);
		System.out.println("Grade :"+grade);
	}
}
