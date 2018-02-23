class A{  
A get(){return this;}  
void message()
{
	 System.out.println("welcome to covariant return type  foo");
}  
}  
  
class covarient extends A
{  
	covarient get()
	{
		return this;
	}  
     void message()
     {
    	 System.out.println("welcome to covariant return type");
     }  
     public static void main(String args[]){  
     new covarient().get().message();  
}  
}  