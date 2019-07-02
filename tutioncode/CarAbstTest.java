abstract class CarAbst{
  
  public abstract void milege();

}

class Chevrolet extends CarAbst{
	  public void milege(){
		  System.out.println("Milege is 30");
	  }
}


class CarAbstTest{
  public static void main(String args[]){
    CarAbst abst = new Chevrolet();
	abst.milege();
  }
}