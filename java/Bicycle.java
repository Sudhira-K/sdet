package javaActivitySesssion2;

public class Bicycle implements BicycleParts,BicycleOperations{

	public int gear;
	public int CurrentSpeed;
	
	
	public Bicycle(int gear, int CurrentSpeed)
	{
		this.gear=gear;
		this.CurrentSpeed=CurrentSpeed;
		
		
		
	}
	
	public void applyBreak(int decrement) {
		
		this.CurrentSpeed -=decrement;
		System.out.println("Current Speed after appling Break :"+this.CurrentSpeed);
		
	}

	
	public void speedUp(int increment) {
		this.CurrentSpeed +=increment;
		System.out.println("Current Speed after appling speed :"+this.CurrentSpeed);
		
	}
	
	public String bicycleDesc()
	{
		
return	" No of gear in BiCycle is :"+this.gear
				+"\n Current Speed is :"+this.CurrentSpeed;
	}
	

}
