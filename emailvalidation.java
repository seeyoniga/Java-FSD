import java.util.regex.*;    
import java.util.*;    


public class emailvalidation{  
    public static void main(String args[]){ 
    	Scanner s = new Scanner(System.in);
    	System.out.println("Please enter your email address");
    	String email = s.nextLine();
        boolean a = checkmailvalidity(email);
        if(a){
          System.out.println("Valid email");
        } 
        else {
          System.out.println("InValid email");
       }
    } 
    static boolean checkmailvalidity(String email) {
    	
    	String r = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.]+$";   
    	String t = email;
    	boolean b = t.matches(r);
    	return b;
    }
}  
 