package com.groovt.APITest

import org.apache.ivy.Main

class Groovy_Acc1_dataTypes {

	static void main(args)
	{
		def x
		int y
		
		def arr1 = [1,2.0, "Kiran Kumat", true, x, y]
		arr1.forEach{println "Value is : "+it+ " Data Type is : "+it.getClass()}
	
	}
	
}
