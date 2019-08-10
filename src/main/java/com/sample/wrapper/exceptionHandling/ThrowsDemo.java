package com.sample.wrapper.exceptionHandling;

public class ThrowsDemo {
    public int divideByZero(int num1, int num2) throws DivideByZeroException{
        int num3 =0;
        try {
            num3= num1/num2;
        }catch (ArithmeticException e){
            throw new DivideByZeroException();
        }
        return num3;

    }
}

