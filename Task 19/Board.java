class Board
{
	double length;
	String color;
	double width;
	
	 Board(double lengthLoad,String colorLoad,double widthLoad)
	{
		length=lengthLoad;
		color=colorLoad;
		width=widthLoad;
	    System.out.println("created Board");
		System.out.println("lengthLoad:"+lengthLoad);
		System.out.println("colorLoad:"+colorLoad);
		System.out.println("widthLoad:"+widthLoad);
	}
}