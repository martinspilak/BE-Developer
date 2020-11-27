package com.appslab;
public class Main {
    public static void main(String[] args) {
    Programmer programmer = new Programmer();
    programmer.setSalary(1700.0f);
    programmer.setBonus(200);
    System.out.println(programmer.getInfo());
    Teacher teacher = new Teacher();
    teacher.setSalary(900.0f);
    teacher.setBonus(300);
    System.out.println(teacher.getInfo());
    }
}
/* Output: Programmer’s salary is 1700.0 and bonus is 200
           Teacher’s salary is 900.0 and bonus is 300
*/


