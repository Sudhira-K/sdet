package com.groovt.APITest

class Groovy_Acc2_Gradescale {
	
	static void main(args)
	{
		
		def marks = [50,100,65,90,0]
		def sum=0, avg =0
		def grade ="F"
		
		marks.forEach{sum+=it}
		println "Sum" + sum
		avg = sum/marks.size()
		println "avg" + avg
		
		switch(avg) {
		case 90..100:
			 grade ="A"
			 break
		 case 80..90:
			 grade ="B"
			 break
		 case 70..79:
			 grade ="C"
			 break
		 case 50..69:
			 grade ="D"
			 break
		 case 0..49:
			 grade ="F"
			 break	 
	     default:
		 println "Invalid Value"
		 
		}
		 
		 println "Max marks " + marks.max()
		 println "Min marks " + marks.min()
		 println "Avg Marks " + avg  
		 println "Grade     " + grade
		 		 
			
			
				
	}

}
