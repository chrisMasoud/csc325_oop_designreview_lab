/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {
	
	public static void main(String[] args) {

		Student std1= new Freshman("James", 20, 12); // name, age, credits
                
                Student std2 = new Senior("John", 30, 90);
		
		// ToDo 11: Set the gpa of the student using the scanner and user
		// 			input and then print the output.
		Scanner sc = new Scanner(System.in);
                System.out.println("What is Student 1's GPA?");
                double std1Gpa = sc.nextDouble();
                std1.setGpa(std1Gpa);
                System.out.println("What is Student 2's GPA?");
                double std2Gpa = sc.nextDouble();
                std2.setGpa(std2Gpa);
		System.out.println(std1);
                
                System.out.println(std2);
		
		// ToDo 12: add comments and explain your code
		
		// ToDo 13: submit using a pull request.
	}

}