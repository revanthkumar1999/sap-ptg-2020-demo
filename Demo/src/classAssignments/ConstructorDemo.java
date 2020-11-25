package classAssignments;

public class ConstructorDemo {
	
	private static int id;
	static String name;
	static String company;
	
	{
		ConstructorDemo.name="Revanth Static1";
		System.out.println("Static Name: "+name+" ");
		getDetails();
	
	}
	{
		ConstructorDemo.name="Revanth Static2";
		System.out.println("Static Name: "+name+" ");
		getDetails();
	
	}
	ConstructorDemo()
	{
		
	}
	ConstructorDemo(int id,String name,String company)
	{
		this.id=id;
		ConstructorDemo.name=name;
		this.company=company;
		System.out.println("Values "+id+" "+name+" "+company);
	}
	public static void getDetails()
	{
		System.out.println("Values "+id+" "+name+" "+company);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo demo = new ConstructorDemo(1,"Reventh","Yash");
		System.out.println("Name: "+name+" ");
		//demo.getDetails();
	}
	static
	{
		ConstructorDemo.name="Revanth Static";
		System.out.println("Static Name: "+name+" ");
	}

}
