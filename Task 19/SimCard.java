class SimCard
{
	double price;
	String color;
	String type;
	
	 SimCard(double priceLoad,String colorLoad, String typeLoad)
	{
		price=priceLoad;
		color=colorLoad;
		type=typeLoad;
	    System.out.println("created Led");
		System.out.println("priceLoad:"+priceLoad);
		System.out.println("colorLoad:"+colorLoad);
		System.out.println("typeLoad:"+typeLoad);
	}
}