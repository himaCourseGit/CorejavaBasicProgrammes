class Employee 
{
	public static String Company="Acintyo";
	public static int salary=2000;
	public String department;
	public int experience;
	public providedataemployee(String a,int b)
	{
   department=a;
   experience=b;
	}
	public static void main(String[] args) 
	{
		Employee employee1=new Employee();
		Employee employee2=new Employee();
		employee1.providedataemployee("admin",1000);
		employee2.providedataemployee("hr",1500);
		System.out.println(employee1);
		
		
	}
}
