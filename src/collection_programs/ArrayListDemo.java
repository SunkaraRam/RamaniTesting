package collection_programs;

import java.util.ArrayList;

public class ArrayListDemo {


	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		
		al.add("Ramani");
		
		al.add(10);
		
		al.add(859380.23f);
		
		al.add('c');
		
		al.add(true);
		
		al.add("Ramani");
		
		al.add(true);

		System.out.println(al.get(5));
		
		System.out.println(al);
		
		
		al.set(0, "Ramu");
		
		System.out.println(al);
		
		int indexres =al.indexOf('c');
		
		System.out.println(indexres);
		
		int indexlast = al.lastIndexOf('c');
		
		System.out.println(indexlast);
		
		
		al.remove(2);
		
		System.out.println(al);
		
		
		
		
		
	}

}
