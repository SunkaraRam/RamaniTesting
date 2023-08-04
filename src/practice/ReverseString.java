package practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		
		
		
		
		
		String res="",input="";
		
		Scanner sc = new Scanner(System.in);
		
		input = sc.nextLine();//ramani
		
		for (int i = input.length()-1; i >=0; i--) {
			
			res = res+input.charAt(i);// ""+i
			
		}
		
		System.out.println(res);
	}

}
