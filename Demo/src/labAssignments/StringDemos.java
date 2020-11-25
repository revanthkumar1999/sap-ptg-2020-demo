package labAssignments;

public class StringDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abc";
		StringBuffer s2=new StringBuffer("pqr");
		StringBuilder s3= new StringBuilder("xyz");
		System.out.println(s1.length());
		System.out.println(s1.charAt(0));
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println(s2.charAt(0));
		System.out.println(s3.charAt(1));
		System.out.println(s2.substring(0,1));
		System.out.println(s3.substring(1,2));
		System.out.println(s2.indexOf("r"));
		System.out.println(s3.indexOf("y"));
	}

}
