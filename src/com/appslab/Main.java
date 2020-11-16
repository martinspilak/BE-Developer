package com.appslab;
import java.util.*;
public class Main {
    public static ArrayList<Integer> array = new ArrayList<Integer>();
    public static void main(String[] args) {

        array.addAll(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5));
        addIfNotExist(6);
        System.out.println();
    }
    public static void addIfNotExist(int number) {
        if (array.contains(number))
            array.forEach((n) -> System.out.println(n));
        else{
            array.add(number);
            array.forEach(System.out::println);
        }
    }

    }
/* Output: 1
           1
           1
           2
           2
           3
           4
           5
           6
*/