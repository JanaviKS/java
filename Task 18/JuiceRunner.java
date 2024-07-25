class JuiceRunner
{
	public static void main(String[] fun)
	{
		System.out.println("running main in JuiceRunner");
		String fruit=new Juice ();
		String ref=juice.company;
		String value=juice.brand;
		double start=juice.price;
		
		System.out.println("juice.company :"+ref);
		System.out.println("juice.brand:"+value);
		System.out.println("juice.price:"+start);
		
		juice.company="coco";
		String ref1=juice.company;
		System.out.println("juice company updated :"+ref1);
		
		juice.brand="orange";
		String value1=juice.brand;
		System.out.println("juice brand updated :"+value1);
		
		juice.price=156;
		double start1=juice.price;
		System.out.println(" juice price updated :"+start1);
		
		
		
		
		
		System.out.println("end main in juiceRunner");
	}
	
	
}