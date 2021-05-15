class BookDriver 
{
	public static void main(String[] args) 
	{
		Book obj=new Book(1, 500, "PHP"); 
		Book obj1=new Book(2, 50, "C#"); 
		System.out.println(obj);
		System.out.println(obj1);
		
	
		Book b=new Book(101, 250, "Java"); 
		Book b1=new Book(101, 250, "Java"); 
		System.out.println(b==b1);
		System.out.println(b.equals(b1));
	}
}
