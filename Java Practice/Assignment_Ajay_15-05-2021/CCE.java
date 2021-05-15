package ExceptionHandling;

class Animal 
{
	void eat()
	{
		System.out.println("Eating");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking...");
	}
}

class CCE
{
	public static void main(String[] args)
	{
		Animal a=new Animal();

		try
		{
			Dog D=(Dog)a;
			D.bark();
		}
		catch (ClassCastException e)
		{
			System.out.println("\"You cannot access members without instance of sub-class\"");
		}
	}
	
}
