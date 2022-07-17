import java.util.regex.*;    
import java.util.*;    


public class emailvalidation{  
    public static void main(String args[]){ 
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
             Matcher matcher = p.matcher(mails);  
             System.out.println(mails +" : "+ matcher.matches()+"\n");  
         }
    } 
}
 