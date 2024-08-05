class Rocket
{
	String country;
	double speed;
	double fuelCapacity;
	int noOfThrusters=3;
	
	public Rocket(String country)
	{
		this.country=country;
	}
	public void Speed(double speed)
	{
		this.speed=speed;
	}
	public void setfuelCapacity(double fuelCapacity)
	{
		this.fuelCapacity=fuelCapacity;
	}
	public void display()
	{
		System.out.println("country:"+this.country);
		System.out.println("speed:"+this.speed);
		System.out.println("fuelCapacity:"+this.fuelCapacity);
		System.out.println("noOfThrusters:"+this.noOfThrusters);
	}
	
}