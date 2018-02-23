class animal
{
	void eat()
	{
		System.out.println("I will eat");
	}
}
class dog extends animal
{
	void bark()
	{
		System.out.println("I do bark!!");
	}
}
class Singleinherit
{
	public static void main(String args[])
	{
		dog d = new dog();
		d.bark();
		d.eat();
	}
}
