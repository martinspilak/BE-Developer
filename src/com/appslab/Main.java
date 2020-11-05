package com.appslab;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        List<Integer> array = Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5);
        if (array.isEmpty())
            System.out.println("The ArrayList is empty");
        else
            array.forEach((n) -> System.out.println(n));
    }
}
