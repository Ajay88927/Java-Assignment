class Book 
{
	int bid;
	double price;
	String title;

	Book() {}

	Book(int bid, double price, String title)
	{
		this.bid=bid;
		this.price=price;
		this.title=title;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", price=" + price + ", title=" + title + "]";
	}

	public boolean equals(Object o)
	{
		Book temp=((Book)o);
		return this.bid==temp.bid &&
			   this.price==temp.price &&
			   this.title==temp.title;
	}
}