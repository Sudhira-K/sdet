package javaActivitySesssion2;

public class Activity2_1 extends Book {

	
	void setTitle(String s) {
		title =s;
		
	}
	
	public static void main(String[] args) {
		Activity2_1 myNovel = new Activity2_1();
		myNovel.setTitle("SDET Book");
		System.out.println(myNovel.getTitle());
		
	}	

}
