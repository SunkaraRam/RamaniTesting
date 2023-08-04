package collection_programs;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEnumaratorDemo {

	public static void main(String[] args) {
		
		Vector Vc = new Vector ();
		
		Vc.addElement(10);
		
		Vc.addElement(null);
		
		Vc.addElement(234.00f);
		
		Vc.addElement('c');
	
		Vc.addElement(true);
		
		Vc.addElement(60);

		Vc.addElement("lakshmi");
		
		System.out.println(Vc);
		
		Enumeration en = Vc.elements();
		
		while (en.hasMoreElements()) {
			
			Object obj = en.nextElement();
			
			System.out.println(obj);
			
		}
	}

}
