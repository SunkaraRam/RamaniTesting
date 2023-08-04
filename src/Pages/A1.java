package Pages;

 class A1 {

protected void method()
{
	System.out.println("hello");
}
 }
	
	 class B extends A1{
		public void method()
		{
	
	System.out.println("hello");
	}
public static void main(String args[])
{
	
B b=new B();
b.method();
}
}