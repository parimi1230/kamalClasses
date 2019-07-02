class Calc{

/*
    Compile Time Polymorphism
-----------------------------------
    Same Method name with different parameters.-Key1
    The linking will happen while compiling. - Key2
this is also called method overloading
*/

 public int add(int a, int b){
	int c=(a+b); 
	return c ;
 }
 
 public int add(int a, int b, int c){
    int d=(a+b+c); 
	return d ;
 }
 
} 

class  CompileTimePolymorphismTest{

   public static void main(String args[]){
     Calc calc = new Calc();
	 System.out.println(calc.add(10, 20));
	 	 System.out.println(calc.add(10, 20, 30));
   }

}