package arrays;

import java.util.*;
public class SecondSmallest1 
{
	public static void main(String[] args) 
	{
		int [] a= {10,-20,-20,20};
		Arrays.sort(a);
		System.out.println("Smallest element is: "+a[0]);
		System.out.println("Second Smallest element is: "+a[1]);
		//System.out.println(a[a.length]);
	}

}
