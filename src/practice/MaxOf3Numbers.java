package practice;

import java.util.Scanner;

public class MaxOf3Numbers {

	public static void main(String[] args) {
		
		int a,b,c;
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 'A' value");
		
		a= in.nextInt();
		
		System.out.println("Enter 'B' value");
		
		b= in.nextInt();
		
		System.out.println("Enter 'C' value");
		
		c= in.nextInt();
		
		if (a>b&&a>c) {
			
			System.out.println("'A' value is big");
		}else if(a<b&&c<b) {
			System.out.println("'B' value is big");
		}else {
			System.out.println("'C' value is big");
			
		      }
		
		
	}

} 
