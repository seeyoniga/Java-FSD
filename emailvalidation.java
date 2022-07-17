import java.util.regex.*;    
import java.util.*;    


public class emailvalidation{  
    public static void main(String args[]){ 
    	 Scanner s = new Scanner(System.in);
    	 System.out.println("ENTER THE EMAIL ID");  
    	 String usermail = s.nextLine();
    	 ArrayList<String> email = new ArrayList<String>();    
         email.add("seeYonigaPrince@companyname.co.in");  
         email.add("12453@companyname.com");  
         email.add("SeeyonigaPrince.middleame@companyname.com");  
         email.add("seeyonigaprince#@companyname.co.in");   
         email.add("@companyname.com");  
         email.add("seeyo;@companynamecom");
         String r = "^[a-zA-Z0-9_!#$%&£'*+/=?`{|}~^.-]+@[a-zA-Z0-9.]+$";  
         Pattern p = Pattern.compile(r);    
         for(String mails : email){    
             if (mails.contains(usermail)) {
            	 
            	 System.out.println("THE EMAIL ID IS AVAILABLE IN THE ARRAY OF STRINGS FOR EMAILS");  
                 System.out.println(mails);
                 Matcher matcher = p.matcher(mails); 
                 System.out.println("WE'LL CHECK IF THE ABOVE MENTIONED EMAIL ID IS VALID OR INVALID"); 
                 System.out.println(mails +" : "+ matcher.matches());  
                 if(matcher.matches()){
                	 System.out.println("VALID EMAIL ID \n");
                 }
                 else {
                	 
                	 System.out.println("INVALID EMAIL ID \n");
                 }
   	 
             }
             else {
            	 System.out.println("THE EMAIL ID IS NOT AVAILABLE IN THE ARRAY OF STRINGS FOR EMAILS"); 
             }
         }
    } 
}
 