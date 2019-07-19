package com.sample.wrapper;

import com.sample.wrapper.varaible_types.ProtectedDemo;

public class ProtectedDemoOutsidePkgTest extends ProtectedDemo {
    public static void main(String[] args) {
        ProtectedDemo protectedDemo = new ProtectedDemo();
        //System.out.println(protectedDemo.protectedVar);
        ProtectedDemoOutsidePkgTest protectedDemo2 = new ProtectedDemoOutsidePkgTest();
        System.out.println(protectedDemo2.protectedVar);
        protectedDemo2.protectedMethod();
    }
}

