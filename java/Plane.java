package javaActivitySesssion2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
	
	private List<String> passengers;
	public  int maxpassengers;
	private Date LastTimeTookOff;
	private Date lastTimeLanded;
	
	public Plane(int maxPassenger)
	{
		this.maxpassengers=maxPassenger;
		this.passengers = new ArrayList<String>();		
	}
	
	public void onBoard(String PassengerName)
	{
		this.passengers.add(PassengerName);
		
	}
	
	public Date takeOff()
	{
		LastTimeTookOff = new Date();
		return this.LastTimeTookOff;
		
	}

	public void land()
	{
		this.lastTimeLanded = new Date();
		this.passengers.clear();
	}
	
	public Date lastTimeLanded()
	{
		
		return lastTimeLanded;
	}
	
	public List<String> getPassesngers()
	{
		
		return this.passengers;
	}
	
}
