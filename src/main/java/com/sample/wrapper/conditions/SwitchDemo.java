package com.sample.wrapper.conditions;

public class SwitchDemo {
    public void check(int number){
        switch (number){
            case 1:
                System.out.println("you have entered number 1 = " + number);
                break;
            case 2:
                System.out.println("you have entered number 2 = " + number);
                break;
            case 3:
                System.out.println("you have entered number 3 = " + number);
                break;
            case 4:
                System.out.println("you have entered number 4 = " + number);
                break;
            default:
                System.out.println(" you have entered the other Numbers = " + number);
                break;
        }

    }

    public static void main(String[] args) {
        SwitchDemo switchDemo = new SwitchDemo();
        switchDemo.check(3);
        switchDemo.check(1);
        switchDemo.check(5);

    }
}
