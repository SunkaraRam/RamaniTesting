package practice;

public class PrivateAccessModifier {
    
	public static void main(String args[]){
           //creating Student class object
           Student obj = new Student();

           //compile time error because private members
           //of a class can be accessed in that class only.
//          System.out.println(Student.rollNo);

//           Student.showRollNo();
    }
}
