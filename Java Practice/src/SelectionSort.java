import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the values of the array");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length-1;i++)
		{
			int pos=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[pos]>a[j])
				{
					pos=j;
				}
			}
				if(pos!=i) 
				{
					int temp=a[i];
					a[i]=a[pos];
					a[pos]=temp;
				}
		}
		System.out.println("The elements of the array after  sorting: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}

}
