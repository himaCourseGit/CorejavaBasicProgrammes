class Boat 
{
	public static int distance=100;
	public int speed;
	public Boat(int speed)
	{
		this.speed=speed;
	}
	public void calculateTime()
	{
		int time=distance/speed;
		System.out.println("time"+time);
	}
}
class River
{
	public static void raceevent()
	{
		Boat boat1=new Boat(15);
		Boat boat2=new Boat(20);
		boat1.calculateTime();
		boat2.calculateTime();
	}
}
class BoatRiver
	{
public static void main(String[] args) 
	{
		River.raceevent();
	}
}
