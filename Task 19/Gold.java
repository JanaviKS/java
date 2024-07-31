class Gold
{
	double price;
	String name;
	double carat;
	
	 Gold(double priceLoad,String nameLoad,double caratLoad)
	{
		price=priceLoad;
		name=nameLoad;
		carat=caratLoad;
	    System.out.println("created Gold");
		System.out.println("priceLoad:"+priceLoad);
		System.out.println("nameLoad:"+nameLoad);
		System.out.println("caratLoad:"+caratLoad);
	}
}