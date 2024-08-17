class Car
{
	public static String brand="Audi";
	public String series;
	public String color;
	public int speed;
    public void initCar(String a,String b,int c)
	{
		series=a;
		color=b;
		speed=c;
		
	}
	public static void main(String[] args) 
	{
		Car car1=new Car();
		Car car2=new Car();
		car1.initCar("a4","green",240);
		car2.initCar("b4","blue",140);

	}
}
