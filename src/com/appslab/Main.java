package com.appslab;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer(1700.0f, 200);
        Teacher teacher = new Teacher(900.0f, 300);
        Driver driver = new Driver(1000.0f, 300);
        List<JobType> list = Arrays.asList(teacher,programmer,driver);
        programmer.getInfo();
        teacher.getInfo();
        driver.getInfo();
        }
    }

/* Output: Programmer's salary is 1900.0.
           Teacher's salary is 900.0 and bonus is 300.
           Driver's salary is 1000.0 and bonus is 300.
*/


