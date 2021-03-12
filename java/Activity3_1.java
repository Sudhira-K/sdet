package JavaActivitySession3;

import java.util.ArrayList;
import java.util.Arrays;

public class Activity3_1 {
	

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Kiran");
		myList.add("Rajat");
		myList.add("Nidhi");
		myList.add(2,"Anil");
		myList.add(1,"Vivek");
		
		System.out.println("Size of ArrayList after removal :"+myList);
		
		for(String str :myList)
		{
			
			System.out.println("Names in the ArrayList :"+str);
		}
		
		System.out.println("3rd element in arraylist "+myList.get(3));
		System.out.println("Is Nidhi contains in list "+myList.contains("Nidhi"));
		System.out.println("Size of ArrayList :"+myList.size());
		myList.remove(4);
		System.out.println("Size of ArrayList after removal :"+myList.size());
		System.out.println("Size of ArrayList after removal :"+myList);
		
	}
}
