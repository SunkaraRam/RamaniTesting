package practice;

import java.util.Scanner;

public class Ascending_Order {

	public static void main(String[] args) {
		
		int n;
		
		Scanner in = new Scanner(System.in);
		
		//System.out.println("Enter number of elements you want:");
		
		n = 5;//in.nextInt();//5
		
		int[] a = new int[n];
		// TODO Auto-generated method stub

		for (int i = 0; i < n; i++) {
			
			System.out.println("Enter a Value to store into array at index = "+i);
			
			a[i] = in.nextInt();
			
			System.out.println("Value stored at index = "+i);
			
		}
		
	}

}
