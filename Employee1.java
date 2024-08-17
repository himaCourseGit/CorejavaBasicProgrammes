class Employee1 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Employee1 employee1=new Employee1();
		employee1.work();
		Employee1 employee2=new Employee1();
         employee2.work();
		 System.out.println("Main ends");
	}
	public void work()
	{
		System.out.println("start work@9:00pm");

earn();
     System.out.println("end work@8:00pm");
	}
	public static void earn()
	{
      System.out.println("earn starts");
	  System.out.println("earn ends");
	}

}
