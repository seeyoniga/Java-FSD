import java.util.*;
import java.io.*;
import java.lang.*;

public class throwss{  
	public static void main(String args[]) throws ArrayIndexOutOfBoundsException{  
			int a[]= {1,2,3,4,5};
			System.out.println("enter the index whose element you want to know");
			Scanner s = new Scanner (System.in); 
			int j =s.nextInt();
			try {
					 System.out.println(a[j]);
				}
			
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}
}