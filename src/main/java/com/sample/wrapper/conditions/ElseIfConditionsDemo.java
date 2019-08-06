package com.sample.wrapper.conditions;

public class ElseIfConditionsDemo {
    public void check(int number){
        if(number < 0){
        System.out.println("Print number is negative = " + number);
        }
        else if (number < 10){
            System.out.println("Print number is less than 10 =" + number);
        }
        else if (number < 20){
            System.out.println("Print number is less than 20 =" + number);
        }
        else if (number < 30){
            System.out.println("Print number is less than 30 =" + number);
        }
    }

    public static void main(String[] args) {
        ElseIfConditionsDemo elseIfConditionsDemo =new ElseIfConditionsDemo();
        elseIfConditionsDemo.check(-10);
        elseIfConditionsDemo.check(9);
        elseIfConditionsDemo.check(19);
        elseIfConditionsDemo.check(29);

    }
}
