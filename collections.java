import java.util.*;

public class collections{

	public static void main(String[] args) {
		
		System.out.println("we will see four types of java collections 1. Arraylist 2.Linkedlist 3.Vector 4.Hashset");
		Arraylist();
		Linkedlist();
		Vector();
		Hashset();
		
		
	}	
   static void Arraylist() {
	   
		  System.out.println("This is an ArrayList");
		  ArrayList<String> family =new ArrayList<String>();   
	      family.add("Femimma");//
	      family.add("Prince");    	   
	      System.out.println(family);  
	}
		
   static void Linkedlist() {
	      System.out.println("This is a LinkedList");
	      LinkedList<String> relationships=new LinkedList<String>();  
	      relationships.add("Mother");  
	      relationships.add("Father");  	      
	      Iterator<String> itr=relationships.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	      
	      }
   }
	      
   static void Vector() {
	      System.out.println("This is a Vector");
	      Vector<Integer> v = new Vector();
	      v.addElement(26); 
	      v.addElement(2001); 
	      System.out.println(v);
   }
   
   static void Hashset() {
	       System.out.println("This is a HashSet");
	       HashSet<Integer> hs=new HashSet<Integer>();  
	       hs.add(11);  
	       hs.add(9);  
	       hs.add(20);
	       hs.add(11);
	       System.out.println(hs);

	}
}