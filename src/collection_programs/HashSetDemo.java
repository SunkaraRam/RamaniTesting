package collection_programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet<>();
		hs.add("Ram");
		hs.add(1253);
		hs.add(true);
		hs.add(12.22f);
		hs.add('c');
		hs.add(null);
		System.out.println(hs.add(null));;
		System.out.println("Set ="+hs);	
		
		ArrayList al =new ArrayList<>();
		al.add("Ram");
		al.add(1253);
		al.add(true);
		al.add(12.22f);
		al.add('c');
		al.add(null);
		al.add(null);
		
		System.out.println("List ="+al);
		
		LinkedHashSet lhs = new LinkedHashSet<>();
		
		lhs.add("Ram");
		lhs.add(1253);
		lhs.add(true);
		lhs.add(12.22f);
		lhs.add('c');
		lhs.add(null);
		System.out.println(lhs.add(null));
		System.out.println("LinkedHashSet ="+lhs);	
		
		
	}

}
