package practice;

import java.util.Iterator;

public class ForLoopDemo {

	public static void main(String args[]) {
		
		forEachDemo1();
		MultiDimensionalDemo();
		forEachDemo();
	}

	public static void MultiDimensionalDemo() {
		
		String[][] students=new String[2][2];
		
		students[0][0]="hyd";
		students[0][1]="sec";
		students[1][0]="patna";
		students[1][1]="chennai";
		
		System.out.println(students[1][1]);
		
		
	}
	
	
	public static void forEachDemo1() {
		
		for (int i = 2; i <=20; i++) {
			
			if (i==15) {
				
				continue;
			}
			System.out.println(i);
		}
		
	}
	
	public static void forEachDemo() {
		
		String[] students = new String[4];
		
		int[] numbers = new int[4];

		students[0] = "Ramani";
		students[1] = "Sai";
		students[2] = "Lak";
		students[3] = "Siri";
//		students[4] = "Sunkara";
//		System.out.println(name[0]);
		
		for (String name : students) {
			
			if (name.equalsIgnoreCase("siri")) {
				
				break;
				
				
			}
			
			System.out.println(name);
			
		}
		
	}
	
}
