package com.groovt.APITest

class Groovy_Acc3_Fibonacci {
	
	static void main(args)
	{
		def a=0, b=1, n=10
		print a
		n.times
		{
			(a,b) = [b,a+b]
			print ","+a
			
		}
		
	}
	
	

}
