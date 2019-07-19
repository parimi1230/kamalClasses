package com.sample.wrapper.varaible_types;


/*
Default can be used in
Variable level :- Instance variable which is of default type can be visible within the package.
Method level :- Method which is of default type can be visible within the package.

Constraints :
We cannot access default variable/method outside the package
 */
public class DefaultDemo {

    String defaultDemoStrr = "20";

    void doDefaultDemo(){
        System.out.println("default demo");
    }

}
