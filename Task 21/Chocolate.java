class Chocolate
{
	String brand;
	double price;
	String flavour="Mango";
	String size;
	
	
	public Chocolate(String brand)
	{
		this.brand=brand;
	}
	public void Price(double price)
	{
		this.price=price;
	}
	public void Size(String size)
	{
		this.size=size;
	}
	public void display()
	{
		System.out.println("brand:"+this.brand);
		System.out.println("price:"+this.price);
		System.out.println("size:"+this.size);
		System.out.println("flavour:"+this.flavour);
	}
	
}