package com.sample.wrapper.conditions;

public class WhileLoopDemo {
    public void printNumbers(int number) {
        int i = 0;
        while (i <= number) {
            System.out.println(" printing the numbers =" + i);
            i++;
        }
    }
    public void printReverseNUmbers(int revNumber){
        int i = revNumber;
        while (i>=0){
            System.out.println("Printing reverse number =" + i);
            i--;
        }

    }

    public static void main(String[] args) {
        WhileLoopDemo whileLoopDemo = new WhileLoopDemo();
        whileLoopDemo.printNumbers(10);
//        whileLoopDemo.printNumbers(20);
        System.out.println("--------------------");
        whileLoopDemo.printReverseNUmbers(5);
    }
}
