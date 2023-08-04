package practice;

public class StudentsC {
	
	static String name;
	
    static int rollnum;
	
	public StudentsC(String inputname, int inputrollnum){ // constructor
		
		this.name=inputname;
		this.rollnum=inputrollnum;
		
	}
	
	static 
	
	{
		
	}
	
	public static void main(String[] args) {
		
		StudentsC s1 = new StudentsC("Ramani",12356);
		
		System.out.println(s1.name+"  "+ s1.rollnum);

		
		StudentsC s2 = new StudentsC("Lakshmi", 256);
		System.out.println(s2.name+"  "+ s2.rollnum);
		
		s2.m1();
	}
	

	
	
	
	
	
	
	
	
	
	private static void m1() { // method
		
		name="Ram";
		rollnum=132;
		
	}
	

}
