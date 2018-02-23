class cc
{
	String color="Black";
}
class dd extends cc
{
	void color()
	{
	String color ="White";
	System.out.println(color);
	System.out.println(super.color);
	}
}
public class supercla 
{
	public static void main(String args[])
	{
		dd d= new dd();
		d.color();
	}
}
