package com.appslab;
import java.lang.reflect.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5);
        HashSet<Integer> hashset = new HashSet<Integer>(array);
        hashset.add(1);
        hashset.forEach(System.out::println);
}
}
/* Output: 1
           2
           3
           4
           5
*/


