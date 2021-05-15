package ExceptionHandling;

class SIOBE 
{
	public static void main(String[] args) 
	{
		String str="Hello World!!";
		
		try
		{
			char ch=str.charAt(15);
		}
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("\"We cannot access the character out of the String length!!!\"");
		}
		System.out.println("Length of String: "+str.length());
		//System.out.println("Length of String: "+ch);
	}
}
