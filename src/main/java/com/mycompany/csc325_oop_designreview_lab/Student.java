package com.mycompany.csc325_oop_designreview_lab;

/**
 * The Student class extends from Human and holds GPA
 * @author Chris Masoud
 */
/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
    //double to hold GPA
    private double gpa;

    /**
     * The Student constructor takes in a name and age and creates an instance 
     * of Student
     * @param name
     * @param age 
     */
    public Student(String name, short age) {
        super(name, age);
    }

    /**
     * The getAddress() method returns the Student's address
     * @return String address
     */
    @Override
    public String getAddress() {
        return this.getAddress();
    }

    /**
     * The setAddress() method takes in an address and assigns it to the
     * Student's address
     * @param address 
     */
    @Override
    public void setAddress(String address) {
        this.setAddress(address);
    }

    /**
     * The getGpa() method returns the Student's GPA
     * @return double gpa
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * The setGpa() method takes in a double and assigns it to the Student's GPA
     * @param gpa 
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
