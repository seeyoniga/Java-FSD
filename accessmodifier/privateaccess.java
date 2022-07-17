package test;

class priaccessspecifier 
{ 
   public void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 

public class privateaccess {

	public static void main(String[] args) {

		System.out.println("Private Access Specifier");
		priaccessspecifier  obj = new priaccessspecifier(); 
		obj.display();

	}
}

