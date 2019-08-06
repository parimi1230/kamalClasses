package com.sample.wrapper.conditions;

public class ForLoopDemo {
    public void printNumbers(int number){
        for(int i=0; i<=number;i++){
            System.out.println("Printing the given numbers =" + i);
        }
    }

    public static void main(String[] args) {
        ForLoopDemo forLoopDemo = new ForLoopDemo();
        forLoopDemo.printNumbers(20);
    }
}
 /*write a multiplication table
 * print even numbers in between 0 and given number
 * print odd numbers in between 0 and given number
  */