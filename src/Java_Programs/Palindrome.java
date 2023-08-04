package Java_Programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner in= new Scanner(System.in);//read value in console
		System.out.println("Enter a num");//to print value in console
		num=in.nextInt();//string of digits(characters) convert int to int type(scanner onject)
		
		int a=num;
		int result=0;
		int reminder;
		
		while(num>0){
			reminder= num%10;
			result=result*10+reminder;
			num=num/10;
		}
		
		if(result==a)
		System.out.println(a+" is a palindrome number");
		else
			System.out.println(a+"is not a palindrome");
			
		}
		
		
}


