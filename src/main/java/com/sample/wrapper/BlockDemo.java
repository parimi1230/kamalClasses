package com.sample.wrapper;

public class BlockDemo {

    static{
        System.out.println("Inside static block.....");
    }
    {
        System.out.println("Inside block.....");
    }

    public static void main(String[] args) {
        System.out.println("Before Instance creation.....");
        BlockDemo demo = new BlockDemo();
    }
}
