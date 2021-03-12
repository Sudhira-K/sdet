package com.groovt.APITest

class Groovy_Acc6_MapsOps {
	
	static void main(args)
	{
		
		def map=[:]
		
		//add keys
		map.putAt(1, "Donkey")
		map.putAt(2, "Cats")
		map.putAt(3, "Tiger")
		
		for(def item: map)
		{
			println item
		}
		
		
		//Merge new key-value pairs
		def newMap = map.plus([4: "Horses", 5: "Donkeys"])
		println newMap
		
		//Print the values in ascending order
		println newMap.values().sort()
		println newMap.values().sort { it.length() }
	}

}
