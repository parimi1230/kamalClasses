class GrandFather{
  public String gfPropertyVal = "100Kg Silver";
}

class Father extends GrandFather{
  public String fathPropertyVal = "100Kg Gold";
}

class Son extends Father{
  public String sonPropertyVal = "100 Diamonds";
}

class InheritenceTest{
  public static void main(String args[]){
  Son son = new Son ();
  System.out.println(son.gfPropertyVal);
Father fath = new Father();
System.out.println(fath.gfPropertyVal);
  }
  
  
}