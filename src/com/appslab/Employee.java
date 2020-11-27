package com.appslab;

public enum Employee {
    PROGRAMMER("Programmer",1700.0f, 200),
    TEACHER("Teacher", 900.0f, 300);

     final String name;
     final float salary;
     final int bonus;

    Employee(String name, float salary, int bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus =  bonus;

    }
    public String getName(){
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public int getBonus() {
        return bonus;
    }
    public void getInfo() {
        System.out.println(name + "'s" + " salary is " + salary + " and bonus is " + bonus+".");
    }
}
