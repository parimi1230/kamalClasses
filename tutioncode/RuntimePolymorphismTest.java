/**
     Runtime polimorphism will happen in case of parent child relationship.
	 This will have Same method signature.
	 The linking will happen at runtime.
**/


class Car{
  public void milege(){
    System.out.println("Car milege is :"+ 15);
  }
}

class TataTiago extends Car{
}

class Audi extends Car{
  public void milege(){
    System.out.println("Audi milege is :"+ 10);
  }
}


class BMW extends Car{
  public void milege(){
    System.out.println("BMW milege is :"+ 8);
  }
}

class BMWA6 extends BMW{
  public void milege(){
    System.out.println("BMW milege is :"+ 25);
  }
}

class RunTimePolymophismTest{
     
	 public static void main(String args[]){
	 Car car = new BMW();
	 car.milege();		 

	 Car car1 = new BMWA6();
	 car1.milege();
	 }
    
}