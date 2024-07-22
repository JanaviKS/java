class Buy 
{
	public static void product(String brand,double price)
	{
		System.out.println("running product in Buy with one string parameter and double price");
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		if(price>-500.35 && price<500.35)
		{
			System.out.println("price is valid");
		}
		else
		{
			System.out.println("price is invalid");
		}
	}
	public static void product1 (String name,int quantity,String quality,double price)
	{
		System.out.println("running product in Buy  with a two String parameter  and one int parameter and one double");
		System.out.println("name:"+name);
	    System.out.println("quantity:"+quantity);
		System.out.println("quality:"+quality);
		System.out.println("price:"+price); 
		if(quantity>-4000 && quantity<4000)
		{
			System.out.println("quantity is valid");
		}
		else
		{
			System.out.println("quantity is invalid");
		}
	    if(price>-50.05 && price<100.05)
		{
			System.out.println("price is valid");
			
		}
		else 
		{
			System.out.println("price is invalid");
			
		}
	}
	public static void bookMovieTicket(String name,String theaterName,int quantity,double price)
	{
		System.out.println("running bookMovieTicket in Buy  with the two String parameter  and one int parameter and one double");
		System.out.println("name:"+name);
	    System.out.println("theaterName:"+theaterName);
		System.out.println("quantity:"+quantity);
		System.out.println("price:"+price);
		if(quantity>-1000 && quantity<2000)
		{
			System.out.println("quantity is valid");
		}
		else
		{
			System.out.println("quantity is in valid");
		}
		if(price>-200.45 && price<200.45)
		{
			System.out.println("price is valid");
		}
		else{
			System.out.println("price is invalid");
		}
		
	}
	public static void buyEgg(int total,double pricePerEgg)
	{
		System.out.println("running buyEgg in buy");
		System.out.println("total:"+total);
		System.out.println("pricePerEgg:"+pricePerEgg);
		if(total>-5000 && total<10000)
		{
			System.out.println("total is valid");
		}
		else{
			System.out.println("total is in vaild");
		}	
		if(pricePerEgg>-7.5 && pricePerEgg<7.5)
		{
			System.out.println(" pricePerEgg is valid");
		}
		else{
			System.out.println(" pricePerEgg is invalid");
		}
	}
	public static void buyShampoo(int quantity,double price,String brand,String manfDate)
	{
		System.out.println("running buyShampoo in buy  with one int parameter and one double parameter and two String parameter");
		System.out.println("quantity:"+quantity);
		System.out.println("price:"+price);
		System.out.println("brand:"+brand);
		System.out.println("manfDate:"+manfDate);
		if(quantity>-10000 && quantity<10000)
		{
			System.out.println("quantity is valid");
		}
		else{
			System.out.println("quantity is invalid");
		}
		if(price>-500.45 && price<500.45)
		{
			System.out.println("price is valid");
		}
		else
		{
			System.out.println("price is invalid");
		}
	}
	public static void 	buyCake(char size,String type,String flavour,double cost,int quantity)
	{
		System.out.println("running buy in buyCake  with one int parameter and one double parameter and two String parameter and one char parameter");
		System.out.println("Size:"+size);
		System.out.println("type:"+type);
		System.out.println("flavour:"+flavour);
		System.out.println("cost:"+cost);
		System.out.println("quantity:"+quantity);
		if(cost>-50.5 && cost<50.5)
		{
			System.out.println(" cost is valid");
		}
		else{
		    System.out.println(" cost is invalid");
		}
		if(quantity>-5 && quantity<5)
		{
			System.out.println(" quantity is valid");
		}
		else{
			System.out.println(" quantity is invalid");
		}
		
	}
	public static void buySmartWatch(String brand,double price,int color,char type,int mode)
   {
     System.out.println("running buySmartWatch in Buy");
     System.out.println("brand:"+brand);
     System.out.println("price:"+price);
     System.out.println("color:"+color);
     System.out.println("type:"+type);
     System.out.println("mode:"+mode);
     if(price>-270.0 && price<10070.78)
    {
       System.out.println("price is valid"); 
    }
    else
     {
       System.out.println("price is invalid");
     }
 
     if(color>-5 && color<5) 
	{
        System.out.println("color is valid"); 
    } 
	else
	{
        System.out.println("color is invalid");
    } 
 }
    public static void buyLaptop (String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize)
  {
     System.out.println("running laptop in Buy");
     System.out.println("brand:"+brand);
     System.out.println("serialNo:"+serialNo);
     System.out.println("price:"+price);
     System.out.println("batteryCapacity:"+batteryCapacity);
     System.out.println("screenSize:"+screenSize);
     System.out.println("os:"+os);
     System.out.println("harddiskSize:"+harddiskSize);
     System.out.println("ramSize:"+ramSize);
  
     if(serialNo>-10 && serialNo<13)
    {
     System.out.println("serialNo is valid"); 
    }
    else
    {
     System.out.println("serialNo is invalid");
    }
 
     if(price>-45550.0 && price<79050.56) 
	{
        System.out.println("price is valid"); 
    } 
	else
	{
        System.out.println("price is invalid");
    } 
    if(batteryCapacity>-3000 && batteryCapacity<6000)
    {
     System.out.println("batteryCapacity is valid"); 
    }
    else
    {
     System.out.println("batteryCapacity is invalid");
    }
 
     if(screenSize>-15.4 && screenSize<17.6) 
	{
        System.out.println("screenSize is valid"); 
    } 
	else
	{
        System.out.println("screenSize is invalid");
    } 
    if(harddiskSize>-500 && harddiskSize<2000) 
	{
        System.out.println("harddiskSize is valid"); 
    } 
	else
	{
        System.out.println("harddiskSize is invalid");
    }
      if(ramSize>-8 && ramSize<32) 
	{
        System.out.println("ramSize is valid"); 
    } 
	else
	{
        System.out.println("ramSize is invalid");
    } 	
 }
}
