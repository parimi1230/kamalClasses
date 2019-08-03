package com.sample.wrapper.operators;

public class ArithmaticOperatorDemo {
//    int x=5,y=8;
    public int add(int x,int y){
       int z=(x+y);
       return z;
    }
    public int sub(int x,int y){
        int z=(x-y);
        return z;
    }
    public int mul(int x, int y){
        int z=(x*y);
        return z;
    }
    public double div(int x, int y){
        double z=(x/y);
        return z;
    }
    public int mod(int x,int y){
        int z=(x%y);
        return z;
    }

    public static void main(String[] args){
        ArithmaticOperatorDemo arithmaticOperatorDemo =new ArithmaticOperatorDemo();
        System.out.println("Addition is = " + arithmaticOperatorDemo.add(5,6));
        System.out.println("Subtraction is =" + arithmaticOperatorDemo.sub(6,8));
        System.out.println("Multiplication is =" + arithmaticOperatorDemo.mul(6,8));
        System.out.println("Division is =" + arithmaticOperatorDemo.div(5,2));
        System.out.println("Module is =" + arithmaticOperatorDemo.mod(5,2));

    }
}
