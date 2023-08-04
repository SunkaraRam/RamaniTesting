package collection_programs;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		
		
		HashSet hs = new HashSet<>();		
		hs.add("687");
		hs.add(102);
		hs.add(103);
		hs.add(101);
		hs.add(104);
		hs.add(106);
		hs.add(105);
		
		System.out.println("HashSet ="+hs);	
		
		TreeSet ts  = new TreeSet<>();
		
		ts.add(102);
		ts.add(103);
		ts.add(101);
		ts.add(104);
		ts.add(106);
		ts.add(105);
		
		System.out.println("TreeSet ="+ts);
	
			
			
	}

}
