//import java.util.Scanner;
class SecondLargest1 
{
	public static void main(String[] args) 
	{
		/*Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		int [] a=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("The elements of the array are: ");
		for (int i=0;i<n ;i++ )
		{
			System.out.println(a[i]);
		}*/

		int [] a= {10,20,30,40,40};
		int largest=0, second_largest=0;
		for (int i=0;i<a.length ;i++ )
		{
			if(a[i]>largest)
			{
				second_largest=largest;
				largest=a[i];
			} 
			else if(a[i]>second_largest && a[i]!=largest)
			{
				second_largest=a[i];
			}
		}
		System.out.println("The second largest element of the array is: "+second_largest);
	}
}
