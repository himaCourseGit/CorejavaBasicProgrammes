class Phone 
{
	public Phone()
	{
		System.out.println("phone rings");
	}
	public Phone(String model)
	{
		this();
		System.out.println("model is"+model);
	}
	public static void main(String[] args) 
	{
	Phone Phone1=new Phone("redmi");
	}
}
