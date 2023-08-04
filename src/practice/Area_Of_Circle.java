package practice;

import java.util.Scanner;

public class Area_Of_Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int radius;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter radious of the circle: ");
		
		radius=in.nextInt();
		
		double
		
		area = Math.PI*radius*radius;
		
		System.out.println("Area of circle is ="+area);
		
	}

}
