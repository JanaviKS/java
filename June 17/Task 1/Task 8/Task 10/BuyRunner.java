class BuyRunner
{
	public static void main (String[] args)
	{
		System.out.println("running main in BuyRunner");
		Buy.product("Gucci",-499.05);
		Buy.product("Gucci",499.05);
		Buy.product1("Tom",-3999,"More",-49.05);
		Buy.product1("Tom",3999,"More",98.05);
		Buy.bookMovieTicket("Tom","SPG",-999,-199.05);
		Buy.bookMovieTicket("Tom","SPG",999,199.05);
		Buy.buyEgg(-4999,-7.9);
		Buy.buyEgg(4999,6.5);
		Buy.buyShampoo(-9999,-499.05,"Sunsilk","june");
		Buy.buyShampoo(9999,499.05,"Sunsilk","june");
		Buy.buyCake('M',"coldcake","chocolate",-49.5,-4);
	    Buy.buyCake('M',"coldcake","chocolate",49.5,4);
		Buy.buySmartWatch("Titan",-269.0,-5,'D',8);
        Buy.buySmartWatch("Sonata",5008.97,4,'A',9);
        Buy.buyLaptop("hp",-9,-3999.0,-2999,-14.9,"array",-499,-7);
        Buy.buyLaptop("DELL",13,50067.89,4080,17.5,"byte",708,17);

		
	}
}