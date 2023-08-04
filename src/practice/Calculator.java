package practice;

public class Calculator extends Calc{

	private int c;


	@Override
	public void add(int a, int b) {
		


	}

	@Override
	public void sub(int a, int b) {
		c = a-b;
		
		System.out.println("Result = "+c);
		
	}

	@Override
	public void mul(int a, int b) {
		c = a*b;
		
		System.out.println("Result = "+c);
	}

	@Override
	public void div(int a, int b) {
		c = a/b;
		
		System.out.println("Result = "+c);
	}

}
