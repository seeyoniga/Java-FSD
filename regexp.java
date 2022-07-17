import java.util.regex.*; 

public class regexp{  
	public static void main(String args[]){    
			Pattern p = Pattern.compile(".ee"); 
			Matcher m = p.matcher("see");  
			Matcher m1 = p.matcher("seeyo");  
			boolean b = m.matches(); 
			boolean b1 = m1.matches();
			System.out.println(b); 
			System.out.println(b1);  
	}
}  