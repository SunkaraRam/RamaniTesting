package practice;

public class B extends A{

	@Override
	public void add(int a, int b) {
		
		int c = a+b;
		
		System.out.println("Addition of two number " + c);
		
	}

	@Override
	public void sub(int a, int b) {
		
		int c = a-b;
		
		System.out.println("Substraction of two number " + c);
		
	}

	@Override
	public void mul(int a, int b) {
		
		int c = a-b;
		
		System.out.println("Multiplication of two number " + c);
		
	}
	@Override
	public void division(int a, int b) {
		// TODO Auto-generated method stub
		int c=a-b;
		
		System.out.println(c);
	}

}
