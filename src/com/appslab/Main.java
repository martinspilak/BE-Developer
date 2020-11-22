package com.appslab;
import java.lang.reflect.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) {
      HashMap<String, Integer> colors = new HashMap<String, Integer>();
      colors.put("Red", 1);
      colors.put("Green", 2);
      colors.put("Black", 3);
      colors.put("White", 4);
      System.out.println("HashMap: " + colors);
      colors.putIfAbsent("Blue", 5);
      System.out.println("New HashMap: " + colors);
}
}
/* Output: HashMap: {Red=1, White=4, Black=3, Green=2}
           New HashMap: {Red=1, White=4, Blue=5, Black=3, Green=2}
*/


