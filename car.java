class Car
{
	public static String brand="Audi";
	public String series;
	public String color;
	public int speed;
	public static void main(String[] args) 
	{
		Car car1=new Car();
		Car car2=new Car();
		car1.series="A4";
		car1.color="Red";
		car1.speed=240;
		car2.series="b4";
		car2.color="Blue";
		car2.speed=220;
		System.out.println(car1.series);
        System.out.println(car1.color);
		System.out.println(car1.speed);
		System.out.println(car2.series);
		System.out.println(car2.color);
		System.out.println(car2.speed);
	}
}
