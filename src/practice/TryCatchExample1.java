package practice;

import java.util.Scanner;

public class TryCatchExample1 {
	
	public static void main(String[] args) {  
        
		try {
			Scanner s = new Scanner(System.in);
			
			int n = s.nextInt();
			
	        int data=50/n;
	        		 //may throw exception
	        
	        System.out.println(data);
		
		} catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
          
        System.out.println("rest of the code");  
          
    }  
   

}
