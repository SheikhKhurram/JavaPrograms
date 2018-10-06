package javaPrograms;

import java.util.Arrays;

public class RemoveDuplicateNumbers {

	public static void main(String[] args)
	{
		int array[] = {1,2,2,3,4,5,5,5};

		removeDupliacates(array);
	}

	
	public static void removeDupliacates(int[] numbers)
	{
		Arrays.sort(numbers);
		int temp = numbers[numbers.length-1];
		for (int i : numbers)
		{
		    if (temp != i)
		    {
		    	System.out.print(i + " ");
		    	temp =i;
		    }
		}
	}
}
