class Ananya
{
	long mobile;
	Knife knife;
	
	public Ananya(long mobile,Knife knife)
	{
		this.mobile=mobile;
		this.knife=knife;
	}
	public void display()
	{
		System.out.println("mobile:"+this.mobile);
		knife.display();
	}
}