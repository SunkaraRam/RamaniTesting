package practice;

public class Student {
    //private members of the class
    private static int rollNo = 5;

    private static void showRollNo(){
            //rollNo which a private data member is
            //accessible in that class.
            System.out.println("RollNo = " + rollNo);
    }
    
    public static void main(String[] args) {
		showRollNo();
	}
    
    
    int  mobileNumber = 98298483;
    
    void showMobileNumber() {
    	
    	System.out.println("Your mobile number is : "+mobileNumber);
    }
    
    protected static String name = "AnddalRamani";

    protected static void showName() {
    	System.out.println(name);
    }
    
    public String mobile = "OnePlus";

    public void showMobileName() {
    	
    	System.out.println(mobile);
    }
    
}

