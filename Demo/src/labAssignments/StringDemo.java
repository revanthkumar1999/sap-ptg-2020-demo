package labAssignments;

public class StringDemo {

	private String s;
	
	public StringDemo(String s1)
	{
		this.s=s1;
	}
	public int stringlength()
	{
		int i=0,length=0;
		 for(char c: s.toCharArray()) {
	         length++;
	      }
		return length;
	}
}
