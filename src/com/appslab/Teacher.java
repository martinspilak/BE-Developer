package com.appslab;

public class Teacher {
    float Salary;
    int Bonus;

    public Teacher(){
        Salary = 900.0f;
        Bonus = 100;
    }
    public String getInfo(){
        return "Teacher’s salary is " + Salary + " and bonus is " + Bonus;
    }
}
