package test;

class pubaccessspecifiers {

	public void display() 
  { 
      System.out.println("This is Public Access Specifiers"); 
  } 
}

public class publicaccess {

	public static void main(String[] args) {
		
	  pubaccessspecifiers obj = new pubaccessspecifiers(); 
      obj.display();  
		
	}
}

