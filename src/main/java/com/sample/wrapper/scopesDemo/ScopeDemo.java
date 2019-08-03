package com.sample.wrapper.scopesDemo;

public class ScopeDemo {
    int z= 20;
    public void test1(){
        int a=123;

    }
    public void test2(){
        int b=456;
        int y=(b+z);
        System.out.println(b+z + "  This is variable  " + y );
    }

    public static void main(String[] args) {
        ScopeDemo scopeDemo = new ScopeDemo();
        scopeDemo.test2();
    }
}
