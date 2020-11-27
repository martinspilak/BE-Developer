package com.appslab;

public class Programmer {
   private float salary;
   private int bonus;

    public String getInfo(){
        return "Programmer’s salary is " + salary + " and bonus is " + bonus;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
