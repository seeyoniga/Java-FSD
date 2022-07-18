import java.util.*;
import java.io.*;
import java.lang.*;

public class throww{  
	public static void main(String args[]){  
			int a[]= {1,2,3,4,5};
			System.out.println("enter the index whose element you want to know");
			Scanner s = new Scanner (System.in); 
			int j =s.nextInt();
			try {
				 if(j>a.length) {
					 throw new Exception("ArrayBoundOutOfIndex error");
				 }
				 else {
					 System.out.println(a[j]);
				 }
				}
			
			catch (Exception e) {
				System.out.println("ArrayBoundOutOfIndex error");
			}
	}
}  
