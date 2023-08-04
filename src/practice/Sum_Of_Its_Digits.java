package practice;

import java.util.Scanner;

public class Sum_Of_Its_Digits 
{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value to calculate its sum : ");
		int num = input.nextInt();
		
		int sum=0;
		
		while (num!=0) {
			
			int lastdigit = num%10;
			sum = sum+lastdigit;
			num=num/10;
		}
		
		System.out.println("Sum of its digit is "+sum);
		
	}

}
