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

class NPE
{
	public static void main(String[] args)
	{
		Animal a=new Dog();
		Dog d=(Dog)a;
		d=null;
		
		try
		{
			d.eat();
		}
		catch (NullPointerException e)
		{
			System.out.println("\"You cannot access members by assigning null reference for reference variable!!\"");
		}
	}
	
}
