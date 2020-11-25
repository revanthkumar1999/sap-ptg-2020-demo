package demopackage.Inheritance;

public class Mobile extends Product{
	
	double cameraPixel;
	int ram;
	Mobile(int pid,String name,double price,String company,double cameraPixel,int ram)
	{
		super(pid,name,price,company);
		this.cameraPixel=cameraPixel;
		this.ram=ram;
	}
	void getDetails()
	{
		System.out.println("The Details of Mobile : \t"+pid+"\t"+name+"\t"+price+"\t"+company+"\t"+cameraPixel+"\t"+ram);
	}
}
