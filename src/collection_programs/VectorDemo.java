package collection_programs;

import java.util.Vector;

public class VectorDemo {


	public static void main(String[] args) {
		
		Vector vc = new Vector();
		
		vc.addElement(10);
		
		vc.addElement("ram");
		
		vc.addElement(20.36f);
		
		vc.addElement('c');
		
		vc.addElement(true);
		
		vc.addElement(null);
		
		vc.addElement(20);
		
		System.out.println(vc);
		
		vc.removeElement(20);
		
		System.out.println(vc);
		
		vc.removeElementAt(0);
		
		System.out.println(vc);
		
		Object res = vc.firstElement();
		
		System.out.println(res);
		
		res = vc.lastElement();
		
		System.out.println(res);
		
		int length = vc.size();
		
		System.out.println(length);
		
		res = vc.elementAt(2);
		
		System.out.println(res);
		
		int capacity = vc.capacity();
		
		System.out.println(capacity);
		

		
	}
	
}
