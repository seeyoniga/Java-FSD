import java.util.*;
import java.lang.*;
public class finall{
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("ENTER THE TWO NUMBERS TO DIVIDE");
    	int n1 = sc.nextInt();
    	int n2 = sc.nextInt();
    	int res=0;
    	try {
        	 res = n1/n2;
    	}
        catch (Exception e) 
        {
            System.out.println("zero division exception"); 
        }
    	finally {
    		System.out.println("THE QUOTIENT IS: "+res); 
    	}
    }
}
