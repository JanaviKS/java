class Chain
{   
   
	public static String brand (String itemName)
	{
		System.out.println("running brand in Chain ");
		if(itemName=="Chocolate")
		{
			String brand="dairyMilk";
			System.out.println("item is found");
			
		}
		
		return "item not found";
	}
	public static String buyLaptop(String brandName) 
		System.out.println("running buyLaptop in Chain ");
		
		if(brandName=="HP")
		{
			System.out.println("brandName:"+brandName );
			System.out.println("It is valid");
			return "brandName is HP";
			
			
		}
		else
		{
		 System.out.println("It is in-valid");
         return "brandName is HP";
		}
		
	}
	public static void brand1(String itemName)
	{
		System.out.println("running brand1 in Chain ");
		if(itemName=="cloth")
		{
			System.out.println("item is found");
			return;
			
		}
		else
		{
		   System.out.println("item is not found");
		   return;	
		}
	}
}