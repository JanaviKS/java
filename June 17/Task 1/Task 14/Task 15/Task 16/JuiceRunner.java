class JuiceRunner
{
	public static void main(String[] information)
	{
		System.out.println("running main in MedicineRunner");
		if(information.length==5)
		{
		System.out.println("getting 5 reference from main method arguments");
		String name=information[0];
		String brand=information[1];
		String flavour=information[2];
		String price=information[3];
		String quantity=information[4];
		
		double convertedPrice=Double.parseDouble(price);
		int convertedQuantity=Integer.parseInt(quantity);
		
		
	    Juice.buyer(name,brand,flavour,convertedPrice,convertedQuantity);
		
	}
	else
	{
		System.out.println("not getting 5 reference from main method arguments");
	}
	}

}