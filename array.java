import java.util.*;
import java.io.*;
import java.lang.*;

public class array{  
	public static void main(String args[]){  
			System.out.println("enter no of elements to add in the array");
			Scanner s = new Scanner (System.in); 
			int j=s.nextInt();
			int a[]=new int[j]; 
			for(int i=0;i<j;i++) {
					System.out.println("enter element"+(i+1));							
					a[i]= s.nextInt();
			}
			System.out.println("The elements of the array are as follows :");
			for(int i=0;i<a.length;i++) {
					System.out.println(a[i]);
			}
	}
}  
