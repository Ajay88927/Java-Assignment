package arrays;

public class LinearSearch 
{
	public static void main(String[] args)
	{
		int [] a= {2,5,8,9,6};
		int key=8;
		boolean b=false;
		int i;
		for(i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				b=true;
				break;
			}
		}
		if(b==true)
		{
			System.out.println(key+ " is found in the given array");
		}
		else
			System.out.println(key+ " is not found in the given array");
	}

}
