class animal{  
	void pet(){
		System.out.println("Animals");}  
}  
class dogg extends animal{  
	void d(){
		System.out.println("Dog");}  
}  
class puppy extends dogg{  
	void puppyy(){
		System.out.println("Puppy");}  
}  
public class inheritance{  
	public static void main(String args[]){  
		puppy p=new puppy();  
		p.puppyy();  
		p.d();  
		p.pet();  
	}
}  
