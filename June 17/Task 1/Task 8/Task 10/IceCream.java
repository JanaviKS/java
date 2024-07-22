class IceCream
{
	
	public static double salary(int age)
	{
		System.out.println("running company in IceCream");
		double salary=15000;
		double salary1= salary+2000;
		double salary2=salary1+4000;
		if(age>=18 && age<=25)
		{
			return salary;
			
		}
		else if(age>25 && age<30)
		{
			return salary1;
		}
		else 
		{
			return salary2 ;
		}
	}
}