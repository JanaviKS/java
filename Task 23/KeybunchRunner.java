class KeybunchRunner
{
	public static void main (String[] args)
	{
		System.out.println("running main in KeybunchRunner");
		
		Key key=new Key(234,"Keyport");
		Keybunch keybunch=new Keybunch("steel",key);
		keybunch.Show();
		
		Key key1=new Key(234,"smartkey");
		Keybunch keybunch1=new Keybunch("metal",key1);
		keybunch1.Show();
		
		
		
		
	}
}