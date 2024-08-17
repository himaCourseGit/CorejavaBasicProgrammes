class Box 
{
	public Box(int close)
	{
           System.out.println("box willclose at"+close+"Am");
	}
	public Box(String open)
	{
		System.out.println("Box willopen at"+open+"pm");
	}
	public Box(double filled)
	{
		System.out.println("Box will filled with"+filled+"water");
	}
	public static void main(String[] args) 
	{
		for(int i=1;i<=2;i++)
		{
          Box Box1=new Box(10);
		  Box Box2=new Box("chitti");
		  Box box3=new Box(10.5);
		}
		
	}
}
