class Train 
{
	public static String startingstation="hyderabad";
	public String destinationstation;
	public int speed;
	public int time;
	public Train(String destinationstation,int speed,int time)
	{
this.destinationstation=destinationstation;
this.speed=speed;
this.time=time;
	}
	public void displayauthordetails()
	{
		System.out.println("destinationstation"+destinationstation);
		System.out.println("speed"+speed);
		System.out.println("time"+time);
	}

	public static void main(String[] args) 
	{
		Train train1=new Train("yellandhu",100,10);
		Train train2=new Train("kothagudem",200,11);
		train1.displayauthordetails();
		train2.displayauthordetails();

	}
}
