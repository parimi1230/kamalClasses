package com.sample.wrapper;

/**
 * 1. Main method
 * 2. create one string varaible
 * 3. we need to parse the string to integer
 *
 * Wrapper classes provides methods in processing of string literal holding a number value.
 */
public class WrapperDemo {

    public static void main(String args[]){
        String eNumber= "123";
        int processedNumber = Integer.parseInt(eNumber);
        System.out.println(Integer.sum(123467, 1212));
        System.out.println("processedNumber is : "+processedNumber);
    }
}
