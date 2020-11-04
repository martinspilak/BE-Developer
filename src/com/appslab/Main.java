package com.appslab;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        if (arr.isEmpty() == true)
            System.out.println("The ArrayList is empty");
        else
            arr.forEach((n) -> System.out.println(n));
    }
}
