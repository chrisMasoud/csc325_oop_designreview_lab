/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author Chris Masoud
 */
public class Freshman extends Student {

    public Freshman(String name, short age, int credits) {
        super(name, age, credits);
    }

    @Override
    public String toString() {
        return String.format("Freshman{ Name: %s, Age: %d, GPA: %.1f, Credits: %d }", getName(), getAge(), getGpa(), getCredits());
    }
    
}
