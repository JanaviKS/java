class MedicineRunner
{
	public static void main(String[] info)
	{
		System.out.println("running main in MedicineRunner");
		if(info.length==4)
		{
		System.out.println("getting 4 reference from main method arguments");
		String name=info[0];
		String manufdate=info[1];
		String price=info[2];
		String quantity=info[3];
		
		double convertedPrice=Double.parseDouble(price);
		int convertedQuantity=Integer.parseInt(quantity);
		int convertedManufdate=Integer.parseInt(manufdate);
		
	    Medicine.buyer(name,convertedManufdate,convertedPrice,convertedQuantity);
		
	}
	else
	{
		System.out.println("not getting 4 reference from main method arguments");
	}
	}

}
	
	
	  
      