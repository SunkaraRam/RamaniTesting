package practice;

public class Method_Return {

	public static void main(String[] args) {

		String res = name("keerthi","Ramani");
		
		System.out.println(res);
		
		int res1 = add(10, 20);
		
		System.out.println(res1);
		
		double res2 = salary(29000,5000,9000);
		
		System.out.println(res2);
	}

	public static String name(String fname,String lname){
		
		String fullname = fname+lname;
		
		return fullname;
		
	}
	
	public static int add(int a,int b) {
		
		int c = a+b;
		return c;
	}
	
	public static double salary(double salary, double tax ,double bonus) {
		
		double totalSalary = salary+tax+bonus;
		
		return totalSalary;
	}
	
	
	
	
	
}
