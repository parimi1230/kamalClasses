package com.sample.wrapper.conditions;

public class NestedIfConditions {
//    check is it positive number & number range is > than 10 or < than 10
    public void check(int number){
        if(number > 0){
            if(number >10){
                System.out.println("Number is greater than 10 =" + number);
            }
            else {
                System.out.println("Number is less than 10 =" +number);
            }
            System.out.println("Number is Positive =" + number);
        }
        else {
            if(number > -10){
                System.out.println("Number is greater than -10 =" + number);
            }
            else {
                System.out.println("Number is less than -10 =" + number);
            }
            System.out.println("Number is Negative =" + number);
        }
    }

    public static void main(String[] args) {
        NestedIfConditions nestedIfConditions = new NestedIfConditions();
        nestedIfConditions.check(5);
        nestedIfConditions.check(-9);

    }
}
