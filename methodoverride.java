class over2
{
	void m()
	{
		System.out.println("Inside First");
	}
}
	class over3 extends over2
	{
	void m()
	{
		System.out.println("inside Second");
	}
	}
public class methodoverride extends over3  {
	public static void main(String args[])
	{
		methodoverride as = new methodoverride();
		as.m();
	}

}
