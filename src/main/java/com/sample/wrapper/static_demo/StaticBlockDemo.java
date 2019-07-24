package com.sample.wrapper.static_demo;

public class StaticBlockDemo {
    static String connection;
    static {
        connection = "Got the connection";
        System.out.println("This is StaticMethodDemo1....");
    }

}
