package com.appslab;
public class Main {
    public static void main(String[] args) {
    Programmer programmer = new Programmer();
    System.out.println(programmer.getInfo());
    Teacher teacher = new Teacher();
    System.out.println(teacher.getInfo());
    }
}
/* Output: Programmer’s salary is 2000.0 and bonus is 200
           Teacher’s salary is 900.0 and bonus is 100
*/


