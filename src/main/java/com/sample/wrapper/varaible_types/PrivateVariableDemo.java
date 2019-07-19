package com.sample.wrapper.varaible_types;

/*
 varaible level - we cannot access the created varaible outside of class
 Method level - we cannot access the created method outside of class
 */

public class PrivateVariableDemo {

    private String name;

    public void test(){
        dontShow();
        System.out.println(name);
    }

    //Inside method we cannot access private variables
    private void dontShow(){
        //private String testtttt;
        System.out.println("Dont show");
    }

}

class MainDemo{
    public static void main(String[] args) {
        final PrivateVariableDemo demo = new PrivateVariableDemo();
        //demo.name; - cant access this, because the variable is private
        demo.test();
        //demo.dontShow(); - cant access this, because the method is private
    }
}
