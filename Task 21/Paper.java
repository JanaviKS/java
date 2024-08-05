class Paper
{
	double thickness=0.05;
	String quality;
	String color;
	double size;
	
	
	public Paper(String quality)
	{
		this.quality=quality;
	}
	public void Color(String color)
	{
		this.color=color;
	}
	public void Size(double Size)
	{
		this.size=size;
	}
	public void display()
	{
		System.out.println("thickness:"+this.thickness);
		System.out.println("quality:"+this.quality);
		System.out.println("color:"+this.color);
		System.out.println("size:"+this.size);
	}
	
}