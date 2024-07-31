class PrintingMachine
{
	double price;
	String name;
	
	
	 PrintingMachine(double priceLoad,String nameLoad)
	{
	    price=priceLoad;
		name=nameLoad;
		System.out.println("created PrintingMachine");
		System.out.println("priceLoad:"+priceLoad);
		System.out.println("nameLoad:"+nameLoad);
	}
}