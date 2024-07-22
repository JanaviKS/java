class School 
{
	public static void main(String[] args )
	{
		learning();
	}
	public static void learning ()
	{
		System.out.println("School provides learning");
		development();
	}
	public static void development()
	{
		System.out.println("School provides development");
		learning();
	}
}