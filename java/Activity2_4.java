package javaActivitySesssion2;

public class Activity2_4 {

	public static void main(String[] args) {
		
		try {
			Activity2_4.exceptionTest("Hello");
			Activity2_4.exceptionTest(null);
			Activity2_4.exceptionTest("won't execute");
		} catch (CustomException me) {
			// TODO Auto-generated catch block
			System.out.println("Inside block :"+me.getMessage());
		}
		
	}
	
	public static void exceptionTest(String str) throws CustomException
	
	{
		if(str==null)
		{
			throw new CustomException("String Value is null");
		}
		else
		{
			
			System.out.println(str);
		}
		
	}

}
