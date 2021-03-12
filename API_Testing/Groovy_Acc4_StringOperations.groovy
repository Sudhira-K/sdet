package com.groovt.APITest

class Groovy_Acc4_StringOperations {
	
	static void main(args)
	
	{
		def str = "This is a Groovy language"
		
		//revers
		def revStr = str.reverse();
		println "Reverse String :"+revStr
		
		//substring
		def subStr = str.substring(10)
		println "Sub String  :"+subStr
		
		//Split str
		def splitStr = str.split(" ")
		println "Split Str :"+splitStr
		
		//remove Groovy
		
		def remGroovy  =str.minus("Groovy")
		println "removed str :"+remGroovy
		
	  def lowerStr = str.toLowerCase()
        def upperStr = str.toUpperCase()
        println "Lower case string: " + lowerStr
        println "Upper case string: " + upperStr
		
		//matches
		def matchstatus = str.matches("(.*)Groovy(.*)")
		println "Matched Status :"+matchstatus
		
		//replace 
		
		def replacewith = "Very Groovy"
		println(str.replaceAll("Groovy", replacewith))
		print str
		
		
	}

}
