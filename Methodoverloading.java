class over  // Method overloading by parameter arguments
{
	static int m (int a , int b)
	{
		return(a+b);
	}
	static int m (int a , int b, int c)
	{
		return(a+b+c);
	}
}
public class Methodoverloading {
	public static void main(String args[])
	{
		
		System.out.println ( over.m (1 ,2));
		System.out.println ( over.m (1 ,2, 3));
	}

}
