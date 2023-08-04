package practice;

import java.util.Scanner;

public class Sum_of_n_numbers {

	public static void main(String[] args) {
 
		Scanner in =new Scanner (System.in);
		
		int n,result=0;
		
		n=in.nextInt();
		
		System.out.println(n);
		
		for(int i=0;i<=n;i++) {
			
			result=result+i;
			
		}
		
		System.out.println(result);
		
		
		
		
	}

}
