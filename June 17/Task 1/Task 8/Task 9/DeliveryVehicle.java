class DeliveryVehicle
{
	public static void deliver(String item,String location)
	{
		System.out.println("running deliver in deliveryVehicle with the two String parameter");
		Company.deliver(item,location);
	}
}