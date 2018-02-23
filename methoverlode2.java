class over1  // Method overloading by parameter arguments
{
	static int m (int a , int b)
	{
		return(a+b);
	}
	static float m (float a , float b)
	{
		return(a+b);
	}
}
public class methoverlode2 {
	public static void main(String args[])
	{
		
		System.out.println ( over1.m (1 ,2));
		System.out.println ( over1.m (1.0f ,2.3f));
	}

}
