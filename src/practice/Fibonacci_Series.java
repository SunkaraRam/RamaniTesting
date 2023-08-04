package practice;

import java.util.Scanner;

public class Fibonacci_Series extends StudentsC  {

	public Fibonacci_Series(String inputname, int inputrollnum) {
		
		super(inputname, inputrollnum);
		super.name="Charan";
		
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int f1,f2=0,f3=1;
		
		for(int i=0;i<n;i++) {
			
			System.out.print(f3+" ");
			f1=f2;
			f2=f3;
			f3=f1+f2;
			
		}
	}

}
