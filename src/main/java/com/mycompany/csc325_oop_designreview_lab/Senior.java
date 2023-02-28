/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author Chris Masoud
 */
public class Senior extends Student {

    public Senior(String name, short age, int credits) {
        super(name, age, credits);
        if (credits < 85) {
            throw new IllegalArgumentException("Senior must have a minimum of 85 credits");
        }
    }
    
}
