package practice;

import java.util.Scanner;

public class Avg_sum {

	public static void main(String[] args) {
		
		int a,b,sum;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 'A' value");
		
		a= in.nextInt();
		
		System.out.println("Enter 'B' value");
		
		b= in.nextInt();
		
		sum=a+b;
		
		System.out.println("Sum of two values = "+sum);
		
		
		float avg = sum/2;
		
		System.out.println("Average of two values = "+avg);
		
		
		Student std = new Student();
		
		std.showMobileNumber();
		
		std.mobileNumber=10;
	}
}
