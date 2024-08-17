class Circle 
{
	public static double pie=3.14;
	public int radius;
	public Circle(){
		this.radius=radius;
	}
	public void getArea()
	{
		double area =pie*radius*radius;
		System.out.println("area of circle"+area);
	}
}
class Drawing
{
	public static void info(){
		Circle circle=new Circle();
		circle.getArea();
	}
}
class Geomentry
{
	public static void main(String[] args) 
	{
		Drawing.info();
	}
}
