package practice;

import java.util.Iterator;

public class StringMethods {

	public static void main(String[] args) {
		
		String name = "KeerthiRamani";
		
		System.out.println(name);
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name.toUpperCase());
		
		String name1 = " keerthi Ramani ";
		
		if (name.equals(name1)) {
			
			System.out.println("Both names are equal");
			
		} else {
			System.out.println("Both names are not equal");			
		}
		
		if (name.equalsIgnoreCase(name1)) {
			
			System.out.println("Both names are equal");
			
		} else {
			System.out.println("Both names are not equal");			
		}
		
		System.out.println(name1.length());
		
		System.out.println(name1.replace('e', 'U'));
		
		System.out.println(name1.trim().length());
		
		System.out.println(name1.substring(9));
		
		System.out.println(name1.substring(9,12));
		
//		name1 = name1.trim();
		
		name1 = name1.replaceAll("\\s", "");
		
		System.out.println(name1);
				
				
				
				
				
		
		char[] letters = name1.toCharArray();
		
		System.out.println(letters.length);
		
		String std = "RamSunkara";
		
//		StringBuffer stb = new StringBuffer();
//		
//		stb.append(std);
//		
//		System.out.println(stb.reverse());
		
		String res = "";
		
		for (int i = std.length()-1; i >=0 ; i--) {
			
			res = res+std.charAt(i);
			
		}
		
		System.out.println(res);
	}

}
