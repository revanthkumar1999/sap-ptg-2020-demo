package demopackage.Inheritance;

public class Product {

	int pid;
	String name;
	double price;
	String company;
	
	Product()
	{
		System.out.println("Constructor");
	}
	Product(int pid,String name,double price,String company)
	{
		this.pid=pid;
		this.name=name;
		this.price=price;
		this.company=company;
	}
	void getDetails()
	{
		System.out.println("The Details of Product : \t"+pid+"\t"+name+"\t"+price+"\t"+company);
	}
	
}
