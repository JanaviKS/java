class SoftwareEnginner
{
	String name;
	int experience;
	String designation;
	double salary;
	
	SoftwareEnginner(String name,int experience,String designation,double salary)
	{
		this.name=name;
		this.experience=experience;
		this.designation=designation;
		this.salary=salary;
	}
	public void print()
	{
		System.out.println("name:"+this.name);
		System.out.println("experience:"+this.experience);
		System.out.println("designation:"+this.designation);
		System.out.println("salary:"+this.salary);
		
	}
}