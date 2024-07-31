class Led
{
	double length;
	String color;
	double width;
	
	 Led(double lengthLoad,String colorLoad,double widthLoad)
	{
		length=lengthLoad;
		color=colorLoad;
		width=widthLoad;
	    System.out.println("created Led");
		System.out.println("lengthLoad:"+lengthLoad);
		System.out.println("colorLoad:"+colorLoad);
		System.out.println("widthLoad:"+widthLoad);
	}
}