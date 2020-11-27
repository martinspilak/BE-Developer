package com.appslab;
import java.lang.reflect.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Person[] obj = new Person[]{
                new Person("John", 21, 23000),
                new Person("Steve", 32, 40000),
                new Person("Martin", 16, 2700)
        };
        System.out.println(peoplesbudget(obj));
    }
    public static boolean peoplesbudget(Person[] people){
        return Arrays.stream(people).map(Person::getName).anyMatch(a -> a.contains("a"));
            }
}
// Output: true



