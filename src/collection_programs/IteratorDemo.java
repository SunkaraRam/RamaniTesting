package collection_programs;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		
		al.add("Ramani");
		
		al.add(10);
		
		al.add(859380.23f);
		
		al.add('c');
		
		al.add(true);
		
		al.add("Ramani");
		
		al.add(true);

		Iterator itr = al.iterator();
		
		while (itr.hasNext()) {
			
			Object obj=itr.next();
			
			System.out.println(obj);
			
			if (obj.equals(10)) {
				itr.remove();
			}
			
		}
		
		System.out.println(al);
		
		
	}


}
