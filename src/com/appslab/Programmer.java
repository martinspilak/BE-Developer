package com.appslab;
import java.lang.*;

public class Programmer extends JobType {
    Jobtype jobtype = Jobtype.Programmer;

    public Programmer(float salary, int bonus) {
        super(salary, bonus);
    }

    public void getInfo() {
        System.out.println(jobtype + "'s" + " salary is " + Salary + " and bonus is " + Bonus+".");
    }
}
