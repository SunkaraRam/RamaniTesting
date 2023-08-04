package practice;

public class IfConditionsDemo {

	public static void main(String[] args) {
		
	elseIFPractice();
		
	}
	
	public static void ifPractice(){
		
		int a = 25;
		int b=65;
		
		if (a<b)
		{
			
			
			System.out.println("b value is bigger than a");
		}
	}
	public static void ifElsePractice() {
		int a = 235;
		int b=1234;
		if (a<b) 
		{
			
			System.out.println("b value is bigger than a");
		}
		else{
			System.out.println(" ramani");
		}
	}
	public static void elseIFPractice() {
		
//		00-12 //Good morming
//		
//./12-16 //Good Afternoon
//		16-19 //Good Evenining
//		19-23 //Good Night
		

		
		/*
		int time = 1;
		
		if (time<12) 
		{
			System.out.println("Good Morning");
		}
		else if(12<time &&time<16)
		{
			System.out.println("Good Afternoon");
		}
		else if(16<time&&time<19) 
		{ 
			System.out.println("Good Evenining");
		}
		else if(19<time&&time<23) {
			System.out.println("Good Night");
		}
		else {
			System.out.println("Clock is broken");
		}
		
*/      
//		100-75 // destrinction
		
//		75-60 // first class
//		60-35 // second class
//		00-34 // fail
		int mark=33;
		if (75<=mark&&mark<=100)
		{
			System.out.println("destrinction");
		}
		else if(61<=mark&&mark<=75)
		{
			System.out.println("grade \'A\'");																			
		}
		else if (35<=mark && mark<=60)
		{
			System.out.println("second class");
	
		}
		
		else
		{
			System.out.println("fail");
	
		}
		
		
		
	}
}
