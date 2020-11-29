package com.appslab;
import java.lang.*;

public class Programmer extends JobType   {
    public Programmer(float salary, int bonus){
        super(salary, bonus, Employee.PROGRAMMER);
    }
}
