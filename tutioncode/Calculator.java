class Calculator{
   
   public int add(int a, int b){
     int c= a+b;
	 return c;
   }
   
  public int sub(int x, int y){
     int z = x-y;
     return z;
  }
  
  
}
class CalculatorTest{
	
  public static void main(String args[]){
  Calculator cal =new Calculator();
  int addVal1 = Integer.parseInt(args[0]);
  int addVal2 = Integer.parseInt(args[1]);
  
  int subVal1 = Integer.parseInt(args[2]);
  int subVal2 = Integer.parseInt(args[3]);
  
  int z= cal.add(addVal1, addVal2);
  int k= cal.sub(subVal1, subVal2);
  System.out.println("addition  " + z );
  System.out.println("Substraction  " + k );  
  }
  
}