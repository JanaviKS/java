class SpeakerRunner
{
	public static void main (String[] args)
	{
		Speaker speaker=new Speaker("bose");
		speaker.Size("large");
		speaker.setCost(1000);
		speaker.display();
		
		Speaker speaker1=new Speaker("apple");
		speaker1.Size("small");
		speaker1.setCost(2000);
		speaker1.display();
		
		Speaker speaker3=new Speaker("boat");
		speaker3.Size("medium");
		speaker3.setCost(3000);
		speaker3.display();
		
		
		Rocket rocket=new Rocket("india");
		rocket.Speed(34600);
		rocket.setfuelCapacity(18);
		rocket.display();
		
		
		Rocket rocket1=new Rocket("south korea");
		rocket1.Speed(34600);
		rocket1.setfuelCapacity(28);
		rocket1.display();
		
		Rocket rocket2=new Rocket("Australia");
		rocket2.Speed(45600);
		rocket2.setfuelCapacity(38);
		rocket2.display();
		
		Chocolate chocolate=new Chocolate("Dairy milk");
		chocolate.Price(100);
		chocolate.Size("large");
		chocolate.display();
		
		Chocolate chocolate1=new Chocolate(" kit kat");
		chocolate1.Price(200);
		chocolate1.Size("medium");
		chocolate1.display();
		
		Chocolate chocolate2=new Chocolate("milky bar");
		chocolate2.Price(50);
		chocolate2.Size("small");
		chocolate2.display();
		
		Projector projector=new Projector("DLP");
		projector.Color("white");
		projector.Weight(500);
		projector.display();
		
		Projector projector1=new Projector("Lcd");
		projector1.Color("BLACK");
		projector1.Weight(600);
		projector1.display();
		
		Projector projector2=new Projector("LED");
		projector2.Color("PURPLE");
		projector2.Weight(700);
		projector2.display();
		
		Paper paper=new Paper("good");
		paper.Color("white");
		paper.Size(76);
		paper.display();
		
		Paper paper1=new Paper("bad");
		paper1.Color("black");
		paper1.Size(56);
		paper1.display();
		
		Paper paper2=new Paper("good");
		paper2.Color("purple");
		paper2.Size(10);
		paper2.display();
		
		
	}
}