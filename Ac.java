class Ac 
{
	public static void cools()
	{
		System.out.println("ac cools room");
	}
	public void model()
	{
		System.out.println("ac having different model");
	}

	public static void main(String[] args) 
	{
		cools();
		Ac obj1=new Ac();
		Ac obj2=new Ac();
		Ac obj3=new Ac();
		obj1.model();
		obj2.model();


	}
}
