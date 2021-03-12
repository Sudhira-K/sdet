package javaActivity1;

public class Car {
	
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public Car()
	{
		tyres=4;
		doors=4;
	}
	
	public void displayCharacteristics()
	{
		
		System.out.println("The color of Car is "+color);
		System.out.println("The transmission type is  "+transmission);
		System.out.println("The make year is  "+make);
		System.out.println("The number of tyres in Car is "+tyres);
		System.out.println("The number of doors in Car is "+doors);
		
	}
	
	public void accelarate()
	{
		System.out.println("The Car is moving forword");
		
	}
	
	public void brake()
	{
		System.out.println("Car has stopped");
		
	}

}
