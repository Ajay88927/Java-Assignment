package arrays;

import java.util.Iterator;
import java.util.Scanner;

public class EvenandOddCount 
{
	public static String countEvenandOdd(int[] a)
	{
	int even_count=0,odd_count=0;
	for (int i = 0; i < a.length; i++) 
	{
		if(a[i]%2==0)
			even_count++;
		else
			odd_count++;
	}
}	
	return "Odd numbers count "+odd_count+"Even numbers count "+even_count;
	
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int n=s.nextInt();
	int [] a=new int[n];
	System.out.println("Enter the elements of the array");
	for (int i = 0; i < a.length; i++) 
	{
		a[i]=s.nextInt();
	}
	System.out.println("The count of even and odd numbers are: "+countEvenandOdd(a));
	
}
}

