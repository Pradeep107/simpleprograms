class students
{
	int a;
	String name;
	static String college ="Karpagam";
	students(int b , String name1)
	{
		a = b;
		name = name1;
	}
	void display ()
	{
		System.out.println("My name is" + a + "and my age is" + name + "Studied in college" +college );
	}
}
public class staticcla {
	public static void main(String args[])
	{
		students s = new students( 10 , "Pradeep");
		students s1 = new students( 11 , "Pranesh");
		s.display();
		s1.display();
		
		
	}

}
