import java.util.*;
import java.lang.*;
public class trycatch{
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("ENTER THE TWO NUMBERS TO DIVIDE");
    	int n1 = sc.nextInt();
    	int n2 = sc.nextInt();
    	try {
        	int res = n1/n2;
        	System.out.println("QUOTIENT IS :"+res);
    	}
        catch (Exception e) 
        {
            System.out.println("zero division exception"); 
        }
    }
}
