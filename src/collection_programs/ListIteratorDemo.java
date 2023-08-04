package collection_programs;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		LinkedList ll= new LinkedList();
		
		ll.add("Ram");
		ll.add("Ganesh");
		ll.add("Ravi");
		ll.add("Kumar");
		ll.add("Naveen");
		ll.add("Dominos");
		ll.add(5241);
		ll.add("Damodar");
		ll.add("KFC");
	
		System.out.println("Before List operations : "+ll);
		
		ListIterator ltr = ll.listIterator();
		
//		while (ltr.hasPrevious()) {
//			
//			System.out.println(" "+ltr.previous());
//			
//			Object obj2 = ltr.previous();
//			
//			System.out.println(obj2);
			
//		}
		
		while (ltr.hasNext()) {
			
			Object obj = ltr.next();
			
			if (obj.equals("Naveen")) {
				
				ltr.remove();
			}
			else if (obj.equals("KFC")) {
				
				ltr.add("Mutton");
				
			}
			else if (obj.equals("Ganesh")) {
				
				ltr.set("AlluArjun");
			}
		
		}
		System.out.println("After List operations : "+ll);
//		System.out.println(ll);
		
	
	
	
	
	}

}
