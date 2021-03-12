package JavaActivitySession3;

import java.util.HashSet;
import java.util.Set;

public class Activity3_2 {

	
	public static void main(String[] args) {
		
		
		Set<String> hs = new HashSet<String>();	
		hs.add("Kiran");
		hs.add("Rajat");
		hs.add("Nidhi");
		hs.add("Anil");
		hs.add("Vivek");
		hs.add("Sundar");
		//Print HashSet
		System.out.println("Original Hashset :"+hs);
		
		//Size of Hashset
		System.out.println("Size of Hashset :"+hs.size());
		
		//Remove Element
		System.out.println("Remove element from Hashset :"+hs.remove("Anil"));
		
		//Remove Element that is not present
		if(hs.remove("Chavan"))
		{
			
			System.out.println("Kiran is removed from Set");
		}
		else
		{
			System.out.println("Kiran is not present in set");
		}
		
		//Search for element
		System.out.println("Checking if Rajat is present in set :"+hs.contains("Rajat"));
		//Print updated Hashset
		System.out.println("Updated HashSet :"+hs);
		
	}
	
}
