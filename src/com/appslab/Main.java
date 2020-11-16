package com.appslab;
import java.util.*;
public class Main {
    public static ArrayList<Integer> array = new ArrayList<Integer>();
    public static void main(String[] args) {

        array.addAll(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5));
        ReturnEven();
        System.out.println();
    }
    public static void ReturnEven() {
        array.stream().filter(a -> a % 2 == 0).forEach(System.out::println);
            }
}
/* Output: 2
           2
           4
*/



