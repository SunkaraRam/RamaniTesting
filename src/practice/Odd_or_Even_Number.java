package practice;

import java.util.Scanner;

public class Odd_or_Even_Number {
	
	
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter any Number : ");
		
		int input = scn.nextInt();
		
		if (input%2==0) {
			System.out.println("Given number is an even number");
		}else {
			System.out.println("Given number is Odd number");
		}
				
	}
	

}
