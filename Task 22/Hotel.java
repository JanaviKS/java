class Hotel
{
    String name;
	Owner owner=new Owner("janu",24,"female");
	
	
	
	public Hotel (String name)
	{
		this.name=name;
	}
	public void show()
	{
		System.out.println("name:"+name);
		owner.print();
	}
}