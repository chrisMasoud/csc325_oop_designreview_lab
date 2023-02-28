package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
    private double gpa;

    public Student(String name, short age) {
        super(name, age);
    }

    @Override
    public String getAddress() {
        return this.getAddress();
    }

    @Override
    public void setAddress(String address) {
        this.setAddress(address);
    }

    // ToDo 3: Add a field for GPA and create setter and getter
    // ToDo 4: Add comments to your code

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
