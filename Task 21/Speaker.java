class Speaker
{
	String brand;//
	String size;
	double cost;
	String output="loud voice";
	
	
	public  Speaker(String brand)//constructor
	{
		this.brand=brand;
	}
	
	
	public void Size(String size)//instance method
	{
		this.size=size;
	}
	public void setCost(double cost)//setter
	{
		this.cost=cost;
	}
	
	 public void display()
	{
		System.out.println("brand:"+this.brand);
		System.out.println("size:"+this.size);
		System.out.println("cost:"+this.cost);
		System.out.println("output:"+this.output);
		
	}
	

}