package com.appslab;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Person[] obj = new Person[]{
                new Person("John", 21, 23000),
                new Person("Steve", 32, 40000),
                new Person("Martin", 16, 2700)
        };
        System.out.println(PeoplesBudget(obj));
    }
    public static int PeoplesBudget(Person[] people){
        return Arrays.stream(people).map(Person::getBudget).reduce(0, Integer::sum);
            }
}
// Output: 65700



