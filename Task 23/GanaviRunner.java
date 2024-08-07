class GanaviRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in GanaviRunner");
		Clip clip=new Clip("Black","slide clip");
		Ganavi ganavi=new Ganavi("jahnavijahnavi099@gmail.com",clip);
		ganavi.display();
		
		Clip clip1=new Clip("purple"," snap clip");
		Ganavi ganavi1=new Ganavi("januksv09@gmail.com",clip1);
		ganavi1.display();
	}	
}