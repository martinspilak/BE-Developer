package com.appslab;
public class Main {
    public static void main(String[] args) {
    Programmer programmer = new Programmer(1700.0f, 200);
    programmer.getInfo();
    Teacher teacher = new Teacher(900.0f, 300);
    teacher.getInfo();
    }
}
/* Output: Programmer's salary is 1700.0 and bonus is 200
           Teacher's salary is 900.0 and bonus is 300
*/


