class Laptop 
{
	int lid;
	double price;
	String ram_size;
	String harddisk_size;

	Laptop() 
	{  }

	Laptop(int lid, double price, String ram_size, String harddisk_size)
	{
		this.lid=lid;
		this.price=price;
		this.ram_size=ram_size;
		this.harddisk_size=harddisk_size;
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", price=" + price + ", ram_size=" + ram_size + ", harddisk_size=" + harddisk_size
				+ "]";
	}
	
	

	/*public String toString()
	{
		System.out.println("Laptop Id: "+lid);
		System.out.println("Laptop price: "+price);
		System.out.println("Laptop ram_size: "+ram_size);
		System.out.println("Laptop harddisk_size: "+harddisk_size);
		System.out.println("=================================================");
		return " ";
	}*/
}
