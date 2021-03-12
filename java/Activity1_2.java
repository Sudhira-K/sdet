package javaActivity2;

public class Activity1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array ={10,77,10,54,-11,10};
		int numSerach = 10;
		int expectedOutput=30;
	//	checkIfArrayContains30(array,numSerach,expectedOutput);
		System.out.println("The Array contains expected output "
				+checkIfArrayContains30(array,numSerach,expectedOutput));
		
		
	
	}
	
	public static boolean  checkIfArrayContains30(int[] Array,int numSerach, int expected)
	{
		int ActualValue=0;
		for(int i=0;i<Array.length;i++)
		{
			if(Array[i]==numSerach)
			{
				ActualValue +=Array[i];
				
			}
			if(ActualValue>expected)
			{
				break;
			}
		}
		
		return ActualValue==expected;
		
	}

}
