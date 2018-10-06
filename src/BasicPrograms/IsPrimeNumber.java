package BasicPrograms;

import java.util.Scanner;

public class IsPrimeNumber {

	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the number");
	   int number = sc.nextInt();
	   isprime(number);
	}
    
	public static void isprime(int num)
    {
		boolean flag = false;
    	for (int i=2 ;i <=num/2;i++)
    	{
    		if (num%i == 0)
    		{
    			flag = true;
    		}
    	}
    	
    	if(flag)
    	{
    		System.out.println("Number is not prime");
    	}
    	else 
    		System.out.println("Number is prime");
    }
}
