class Car{
     
	String brand = "Audi";
    String stearingType = "Power";
    String fuelType	= "Petrol";
    Double engineSize = 1.6;
	boolean airBags = true;
	
    public String getBrand(){
        return brand;     
    }	
    
	public Double getEngineSize(){
        return engineSize;     
    }
	
	public boolean hasAirBags(){
		return airBags;
	}
	
	public Double getCapacityAfterSwitchOnBooster(Integer boosterCapacity, Double engineSize){
	    return boosterCapacity * engineSize;
	}
	
}

class CarTest{
   
   public static void main(String args[]){
   
      Car car = new Car();
	  System.out.println("Car brand is :" +car.getBrand());
      
   }

}