package com.appslab;
import java.util.*;

public class Main {
    public static ArrayList<Integer> array = new ArrayList<Integer>();

    public static void main(String[] args) {

        array.addAll(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5));
        Multiple();
        System.out.println();
    }

    public static void Multiple() {
        array.stream().map(a -> a * array.size() + ", ").forEach(System.out::print);
        }
    }






