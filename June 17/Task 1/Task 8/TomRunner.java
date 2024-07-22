class TomRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in TomRunner");
		Paint.picture("Dior");
		Paint.design("Dior","Red");
		Paint.identification("Dior",60.5d);
		Paint.creativity("Purple","water based paint",70.55d);
		Train.book1("india","korea");
		Train.book2("india","korea",600000);
		Train.book3("india","korea",600000,80.5d);
		Train.cancel1(800000);
		Train.cancel2("india","korea");
		Biriyani.kabab("rama");
        Biriyani.chicken("chillichiken");
        Biriyani.colddrinks("pepsi");
        Biriyani.water(50000);
        Biriyani.kushka(90.55f);
	}
}