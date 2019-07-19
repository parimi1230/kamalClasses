package com.sample.wrapper.varaible_types;

/*
1. create Class
2. create protected variable inside class
3. create test class(Class with main method) inside the package
4. out side package.

Protected can be applied to variable level and method level
when we create protected variable it can be accessed within the package,and
If we want to access it outside the package then it should be extended to another class and we can access it by creating
instance for extended class.
 */
public class ProtectedDemo {
    protected String protectedVar = "Ppriting proctected var";

    protected String protectedMethod(){
       return  "REreturning protected string";
    }
}
