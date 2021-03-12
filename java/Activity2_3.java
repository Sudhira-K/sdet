package javaActivitySesssion2;

public class Activity2_3 extends Bicycle{

	public int seatHeight;
	public Activity2_3(int gear, int CurrentSpeed, int starHeight ) {
		super(gear, CurrentSpeed);
		seatHeight=starHeight;
		
	}
	
	public void seatHeight(int newValue)
	{
		seatHeight= newValue;
		
	}

	
	public String bicycleDesc()
	{
		
	return      super.bicycleDesc()
				+"\n Seat height is :"+this.seatHeight;
	}
	
	
	//Driver Class
	
	public static void main(String[] args) {
		
		Activity2_3 mb  = new Activity2_3(5,60,25);
	System.out.println(	mb.bicycleDesc());
		mb.applyBreak(10);
		mb.speedUp(15);
		
	}
}
