package Java_Programs;

import java.util.Scanner;

public class Armstrong_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter a num");
	num=in.nextInt();//153
	
	int a=num;
	int res=0;
	int reminder;
	
	while(num>0) {
		reminder=num%10;
		res=res+(int)Math.pow(reminder,3);
		num=num/10;
	}
	
	// reminder = 3 = Math.pow(3,3); 3*3*3= 27, results=27,5*5*%=125+27= 152//results=152, 1*1*1=1 = 153
		
		if(res==a)
			System.out.println(a+"is an arnstrong");
		else
			System.out.println(a+"is not armstrong");
	}
	
	
	}


