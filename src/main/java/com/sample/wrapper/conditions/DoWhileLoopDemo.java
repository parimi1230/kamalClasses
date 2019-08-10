package com.sample.wrapper.conditions;

public class DoWhileLoopDemo {
    public void printNumbers(int number){
        int i =0;
        do{
            System.out.println("Print do statement =" + i);
            i++;
        }
        while (i< number);

    }

    public static void main(String[] args) {
        DoWhileLoopDemo doWhileLoopDemo =new DoWhileLoopDemo();
        doWhileLoopDemo.printNumbers(5);
    }
}
