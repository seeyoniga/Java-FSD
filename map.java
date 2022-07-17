import java.util.*;
public class map {

	public static void main(String[] args) {

		HashMap<String,String> h =new HashMap<String,String>();      
	      h.put("seeyo is ","myslef");    
	      h.put("leah is seeyo's","sister");    
	      h.put("femimma is seeyo's","mother");   
	       
	      System.out.println("The elements of Hashmap are as follows :"); 
	      System.out.println("----------------------------------------");
	      for(Map.Entry m:h.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	       
	      Hashtable<String,String> ht=new Hashtable<String,String>();  
	      
	      ht.put("rachel is seeyo's","friend");  
	      ht.put("shwetha is seeyo's","friend");  

  
	      System.out.println("\n");
	      System.out.println("The elements of HashTable are as follows : ");  
	      System.out.println("----------------------------------------");
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      System.out.println("\n");
	      TreeMap<String,String> map=new TreeMap<String,String>();    
	      map.put("prince is seeyo's","father");    
	      map.put("dd is seeyo's","brother");    
	      map.put("boss is seeyo's","brother");       
	      
	      System.out.println("The elements of TreeMap are "); 
	      System.out.println("----------------------------------------");
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}
