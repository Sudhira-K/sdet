package javaActivity4;

import java.util.Arrays;

public class Activity1_4 {

	public static void main(String[] args) {
		
		int[] unsortedAddary ={9, 5,-1,30,21 ,45,31, 1, 4, 3};
		System.out.println("Array in unsorted order:");
		System.out.println(Arrays.toString(unsortedAddary));
		sortArray(unsortedAddary);
		System.out.println("Array in Sorted Array");
		System.out.println(Arrays.toString(unsortedAddary));
		
	}
	
	public static void sortArray(int sortArray[])
	{
		int len=sortArray.length;
		int temp=0;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(sortArray[i]>sortArray[j])
				{
					temp=sortArray[i];
					sortArray[i]=sortArray[j];
					sortArray[j]=temp;
					
				}
				
			}
			
		}
		
	//	System.out.println(Arrays.toString(sortArray));
	}

}
