class Studentc
{
	public Studentc(int marks)
	{
		System.out.println("Student Constructor with arg");
		System.out.println("studentMarks:"+marks);
	}
	public Studentc()
	{
		this(89);
		System.out.println(" Student Constructor without arguments");

	}
	public static void main(String[] args) 
	{
		Studentc Student1=new Studentc();
	}
}
