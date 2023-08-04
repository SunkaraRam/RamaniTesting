package practice;

import java.util.Scanner;

public class SwitchDemo {
	
	public static void main(String args[]) {
		
		/*
		Scanner scn =new  Scanner(System.in);
		
		int day = scn.nextInt();
		
		switch (day) {
		case 1: {
			
			System.out.println("Sunday");
			break;
		}
		case 2: {
					
					System.out.println("Monday");
					break;
				}
		case 3: {
			
			System.out.println("Tuesday");
			break;
		}
		case 4: {
			
			System.out.println("Wednesday");
			break;
		}
		case 5: {
			
			System.out.println("Thursday");
			break;
		}
		case 6: {
			
			System.out.println("Friday");
			break;
		}
		case 7: {
			
			System.out.println("Saturday");
			break;
		}
		default:
			System.out.println("Enter valid day");
		}
		*/
		
		String name1 ;
		int age;
		String gender ;
		String City ;
		
		
		Scanner scn = new Scanner(System.in);
//		
		String name = scn.nextLine();

		
		switch(name.toLowerCase()) {
			case "ramani":
				
				name1 = "Keerthi Ramani";
				age = 23;
				gender = "Female";
				City = "Hyderabad";
				System.out.println(name1);
				System.out.println(age);
				System.out.println(gender);
				System.out.println(City);
				System.out.println("Software Engineer in CTS");
				break;
			case "ganesh":
				name1 = "Ganesh";
				age = 24;
				gender = "Male";
				City = "Hyderabad";
				System.out.println(name1);
				System.out.println(age);
				System.out.println(gender);
				System.out.println(City);
				System.out.println("Software Engineer in Capgemini");
				break;
				
			case "lakshmi":
				name1 = "lakshmi";
				age = 24;
				gender = "Female";
				City = "Hyderabad";
				System.out.println(name1);
				System.out.println(age);
				System.out.println(gender);
				System.out.println(City);
				System.out.println("Software Engineer in CTS");
				break;
				
			default:
				System.out.println("Details not available");
				
			
		
		}
		
		
	}

}
