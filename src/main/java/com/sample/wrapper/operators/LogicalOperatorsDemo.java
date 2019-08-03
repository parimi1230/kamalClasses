package com.sample.wrapper.operators;

public class LogicalOperatorsDemo {

    public boolean testOperatorAnd(int x,int y){
        int contsValue = 2;
        boolean z= x>contsValue && y<contsValue;
        return z;
    }
    public boolean testOperatorOr(int x,int y){
        int contsValue = 2;
        boolean z= x>contsValue || y<contsValue;
        return z;
    }
    public boolean testOperatorLessthan(int x,int y){
        boolean z= x<y;
        return z;
    }
    public boolean testOperatorGreaterthan(int x,int y){
        boolean z= x>y;
        return z;
    }public boolean testOperatorLessthanOrEquals(int x,int y){
        boolean z= x<=y;
        return z;
    }public boolean testOperatorGreaterthanOrEquals(int x,int y){
        boolean z= x>=y;
        return z;
    }

    public static void main(String args[]){
        LogicalOperatorsDemo logicalOperatorsDemo =new LogicalOperatorsDemo();
        System.out.println("And operator is Success sceanrio : " + logicalOperatorsDemo.testOperatorAnd(3,1));
        System.out.println("And operator is Failure sceanrio : " + logicalOperatorsDemo.testOperatorAnd(1,3));

        System.out.println("Or operator is Success sceanrio : " + logicalOperatorsDemo.testOperatorOr(1,1));
        System.out.println("Or operator is Failure sceanrio : " + logicalOperatorsDemo.testOperatorOr(1,3));

        System.out.println("LessThan operator is Success sceanrio : " + logicalOperatorsDemo.testOperatorLessthan(1,3));
        System.out.println("LessThan operator is Failure sceanrio : " + logicalOperatorsDemo.testOperatorLessthan(3,1));

        System.out.println("LessThanOrEqual operator is Success sceanrio : " + logicalOperatorsDemo.testOperatorLessthanOrEquals(1,3));
        System.out.println("LessThanOrEqual operator is Success Equal sceanrio : " + logicalOperatorsDemo.testOperatorLessthanOrEquals(1,1));
        System.out.println("LessThanOrEqual operator is Failure sceanrio : " + logicalOperatorsDemo.testOperatorLessthanOrEquals(3,1));


    }

}
