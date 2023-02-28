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

        //Student variable to hold Freshman reference
        Student std1 = new Freshman("James", 20, 12);
        //Student variable to hold Senior reference
        Student std2 = new Senior("John", 30, 90);
        //Scanner to get user input
        Scanner sc = new Scanner(System.in);
        //Prompt user for std1 gpa
        System.out.println("What is Student 1's GPA?");
        //Get user input
        double std1Gpa = sc.nextDouble();
        //Set std1 gpa
        std1.setGpa(std1Gpa);
        //Prompt user for std2 gpa
        System.out.println("What is Student 2's GPA?");
        //Get ser input
        double std2Gpa = sc.nextDouble();
        //Set std2 gpa
        std2.setGpa(std2Gpa);
        //Output Freshman toString()
        System.out.println(std1);
        //Output Senior toString()
        System.out.println(std2);

    }

}
