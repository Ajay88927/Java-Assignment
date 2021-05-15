package arrays;

import java.util.*;
public class SecondLargest {

	public static void main(String[] args) 
	{
		int [] a= {10,20,30,40,50};
		Arrays.sort(a);
		System.out.println("Largest element is: "+a[a.length-1]);
		System.out.println("Second largest element is: "+a[a.length-2]);
		//System.out.println(a[a.length]);
	}

}
