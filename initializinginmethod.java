class sample
{
	int a;
	String name;
	void insert(int b , String name1)
	{
		a = b;
		name = name1;
	}
	void display()
	{
		System.out.println("My name is" + name +"age is " +a);
	}
}
public class initializinginmethod {
	public static void main(String args[])
	{
		sample s = new sample();
		sample s1 = new sample();
		s.insert(10, "Pradeep");
		s1.insert(11, "Pranesh");
		s.display();
		s1.display();
	}


}
