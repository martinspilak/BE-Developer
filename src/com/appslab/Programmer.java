package com.appslab;

public class Programmer {
    float Salary;
    int Bonus;

    public Programmer(){
        Salary = 2000.0f;
        Bonus = 200;
    }
    public String getInfo(){
        return "Programmer’s salary is " + Salary + " and bonus is " + Bonus;
    }
}
