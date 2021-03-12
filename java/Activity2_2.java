package javaActivitySesssion2;

public class Activity2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Plane plane = new Plane(3);
		plane.onBoard("Kiran");
		plane.onBoard("Rajat");
		plane.onBoard("Nidhi");
		System.out.println("Plane took off : "+plane.takeOff());
		System.out.println("Passengers name are : "+plane.getPassesngers());
		plane.land();
		System.out.println("Plane landed at :"+plane.lastTimeLanded());
		System.out.println("People on the plane after landing: " + plane.getPassesngers());
		

	}

}
