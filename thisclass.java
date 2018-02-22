class students1
{
	int a;
	String name;
	static String college ="Karpagam";
	students1(int b , String name1)
	{
		String college="IVTL";
		this.a = b;
		this.name=name1;
		this.college = college;
	}
	void display ()
	{
		System.out.println("My name is" + a + "and my age is" + name + "Studied in college" +college );
	}
}
public class thisclass {
	public static void main(String args[])
	{
		students1 s = new students1( 10 , "Pradeep");
		students1 s1 = new students1( 11 , "Pranesh");
		s.display();
		s1.display();
		
		
	}

}
