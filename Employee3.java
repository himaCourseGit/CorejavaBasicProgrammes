class Employee3 
{
	public static String company="Acintyo";
	public  String department;
	public  int experience;
	public  Employee3(String department,int experience)
	{
		this.department=department;
		this.experience=experience;
	}
	public void displayemployee()
	{
         System.out.println("department"+department);
		 System.out.println("experience"+experience);
	}
	public static void main(String[] args) 
	{
		Employee3 employee1=new Employee3("Admin",10);
		Employee3 employee2=new Employee3("Hr",5);
		employee1.displayemployee();
		employee2.displayemployee();
		
	}
}
