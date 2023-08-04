package practice;

public abstract class AbstractDemo {
	
	
	private final String name="ram";
	
	protected abstract void wheels();
	
	private void add(int a , int b){
	    
		int c = a+b;
		
		System.out.println("Sum of C = ");
	   }
	
	public  void demo2() {
		
		System.out.println("Herer we can define any keyword instead of abstract");
	} 
	
	// 5th point
//	private String std1="dharani";
	
	
	// 6th point
		public String name1;
		
	
	// 7 th point
	static {
		
		System.out.println("This is static block");
	}
	{
		
		System.out.println("This is instance block");
	}
	//8th point
	public AbstractDemo() {
		
	}
	
	

}
