package com.sample.wrapper.varaible_types;

public class PublicDemoTestInsidePackage {
    public static void main(String[] args) {
        PublicDemo publicdemo = new PublicDemo();
        System.out.println("Inside the package");
        publicdemo.printPartyName();
        System.out.println(publicdemo.partyName);
    }
}
