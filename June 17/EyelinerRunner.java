class EyelinerRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in eyeliner");
		int[] brand={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int total =brand.length;
		System.out.println("total brand:"+total);
		for(int position=0;position<=20;position++)
		{
			if(brand[position]%3==0)
			{
				System.out.println(brand[position]);
			}
			
			
			
			
		}
	}
	
}