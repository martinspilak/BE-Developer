package com.appslab;

public class Teacher extends JobType {
    Jobtype jobtype = Jobtype.Teacher;

    public Teacher(float salary, int bonus) {
        super(salary, bonus);
    }
    public void getInfo() {
        System.out.println(jobtype + "'s" + " salary is " + Salary + " and bonus is " + Bonus+".");
    }
}
