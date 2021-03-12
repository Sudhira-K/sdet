package javaActivitySesssion2;

public class CustomException extends Exception {
	
	
	private String message;
	
	public CustomException(String Message)
	{
		
		this.message=Message;
	}

	@Override
	public String getMessage()
	{
		
		return this.message;
	}
	
	
}
