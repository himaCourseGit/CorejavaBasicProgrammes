class Cup 
{
	public Cup( int fills)
	{
System.out.println("cup fills"+fills);
	}
	public Cup(String name)
	{
		this(20);
System.out.println("cup floats"+name);
	}
	public Cup(double weight)	
	{
		this("chitti");
		System.out.println("cup is plastic"+weight);
	}
	public static void main(String[] args) 
	{
	Cup Cup1=new Cup(10.5);
	}
}
