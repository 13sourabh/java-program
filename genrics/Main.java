package com.genrics;

public class Main {
    public static void main(String[] args) {
        // Instance of Integer type
        Test<Integer> iobj = new Test<Integer>(15);
        System.out.println(iobj.getObject());

        // Instance of String type
        Test<String> sobj = new Test<String>("Hello");
        System.out.println(sobj.getObject());
    }
}