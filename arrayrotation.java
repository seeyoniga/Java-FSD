import java.util.*;
import java.lang.*;
import java.io.*;

public class arrayrotation {    
	 public static void main(String[] args) { 
		 	Scanner sc = new Scanner(System.in);
	        int a[] = {1, 3, 5, 7, 9};  
	        System.out.println(" BY HOW MUCH STEPS DO U WANT TO ROTATE THE ARRAY? ");   
	        int n = sc.nextInt() ;     
	        System.out.println("Array before rotation : ");    
	        for (int k = 0; k < a.length; k++) {     
	            System.out.print(a[k] + " ");     
	        }        
	        for(int k = 0; k < n; k++){    
	            int j, l;      
	            l = a[a.length-1];    
	            
	            for(j = a.length-1; j > 0; j--){     
	                a[j] = a[j-1];    
	            }       
	            a[0] = l;    
	        }    	        
	        System.out.println();       
	        System.out.println("Array after rotation of "+n+"steps : ");    
	        for(int k = 0; k< a.length; k++){    
	            System.out.print(a[k] + " ");    
	        }    
	    }    
	}   