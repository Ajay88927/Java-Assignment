import java.util.Iterator;
import java.util.Scanner;
public class Largest 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		int [] a=new int[n];
		System.out.println("Enter the value of the elements");
		for(int i=1;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		
		int large=a[0];
		for(int i=1;i<n; i++)
		{
			if (a[i]>large)
			{
				large=a[i];
			}
		}
		System.out.println("The largest element of the array is: "+large);
	}

}
