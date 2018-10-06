package BasicPrograms;

import java.util.Scanner;

public class PrintingPrimeNumbers {

	public static void main(String[] args)
	{
	  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number");
		int num = sc.nextInt();
		System.out.println("Enter the ending number");
		int endnum = sc.nextInt();
		for (int i = num ; i <= endnum ; i++)
		{
			int count = 0 ; 
		    for (int j=2 ; j < i;j++)
		    {
			if (i%j == 0)
		    {
		     	count++;
		     	break;
		    }
		}
		    if (count == 0)
		    {
		    	System.out.print(i + " ");
		    }
		}
	}

}
