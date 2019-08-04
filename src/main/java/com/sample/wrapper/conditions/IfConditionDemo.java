package com.sample.wrapper.conditions;

public class IfConditionDemo {
    public void check(int number){
        if(number > 0){
            System.out.println("Number is Positive =" + number);
        }
        else {
            System.out.println("Number is Negative =" + number);
        }
    }

    public static void main(String[] args) {
        IfConditionDemo ifConditionDemo = new IfConditionDemo();
        ifConditionDemo.check(5);
        ifConditionDemo.check(-9);

    }
}
