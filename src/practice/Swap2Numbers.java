
package practice;

public class Swap2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=100; 
		
		int num2=50;
		
		//logic
		System.out.println("Befor Swapping of 2 numbers");

		System.out.println("num1 value is = "+num1);
		System.out.println("num2 value is = "+num2);

		
		num1 = num1+num2; //num1=100+50=150;//
		num2=num1-num2; //num2=150-50=100
		num1=num1-num2;//num1=150-100=50

		System.out.println("After Swapping of 2 numbers");
		System.out.println("num1 value is = "+num1);
		System.out.println("num2 value is = "+num2);

	}

}
