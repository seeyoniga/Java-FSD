package test;

class proaccessspecifiers {

	protected void display() 
    { 
        System.out.println("This is protected access specifier"); 
    } 
}

public class protectedaccess extends proaccessspecifiers {
	public static void main(String[] args) {
		protectedaccess obj = new protectedaccess ();   
	       obj.display();  
	}

}


