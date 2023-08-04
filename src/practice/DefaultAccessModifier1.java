package practice;

public class DefaultAccessModifier1 {
    public static void main(String args[]){
           //creating Student class object
           Student obj = new Student();

           //No compile time error because members of the class
           //of a class can be accessed in that package but can't be
           //accessed outside the package.
           System.out.println(obj.mobileNumber);
           obj.showMobileNumber();;
           
           obj.showName();
           
           obj.name="";
     }
}
