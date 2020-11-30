package com.appslab;
import com.appslab.model.*;
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
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        System.out.println("Sum of salaries is: " + employeeService.salarySum(list)+".");
        System.out.println("Sum of bonuses is: " + employeeService.bonusSum(list)+".");
        }
    }

/* Output: Programmer's salary is 1900.0.
           Teacher's salary is 900.0 and bonus is 300.
           Driver's salary is 1000.0 and bonus is 300.
           Sum of salaries is: 3600.0.
           Sum of bonuses is: 800.
*/


