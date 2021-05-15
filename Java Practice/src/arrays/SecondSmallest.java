package arrays;

class SecondSmallest 
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

		int [] a= {1,1,2,3,4,5,1};
		//int smallest=a[0], second_small=a[1];
		int smallest=Integer.MAX_VALUE, second_small=Integer.MAX_VALUE;
		for (int i=0;i<a.length ;i++ )
		{
			if(a[i]<smallest)
			{
				second_small=smallest;
				smallest=a[i];
			} 
			else if(a[i]<second_small && a[i]!=smallest)
			{
				second_small=a[i];
			}
		}
		System.out.println("The smallest element of the array is: "+smallest);
		System.out.println("The second smallest element of the array is: "+second_small);
	}
}
