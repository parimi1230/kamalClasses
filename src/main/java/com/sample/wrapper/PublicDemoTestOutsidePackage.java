package com.sample.wrapper;

import com.sample.wrapper.varaible_types.PublicDemo;

public class PublicDemoTestOutsidePackage {
    public static void main(String[] args) {
        PublicDemo publicdemo = new PublicDemo();
        System.out.println("outside the package");
        publicdemo.printPartyName();
        System.out.println(publicdemo.partyName);
    }
}
