package com.sample.wrapper.exceptionHandling;

public class TryAndCatchDemo {
    public int divide(int num1 , int num2){
        int num3 = (num1/num2);
        return num3;
    }

    public static void main(String[] args) {
        TryAndCatchDemo tryAndCatchDemo =new TryAndCatchDemo();
      try {
          tryAndCatchDemo.divide(50,0);
      }catch (ArithmeticException e){
          System.out.println(" Dont enter zero value for diviser");
      }

    }
}
