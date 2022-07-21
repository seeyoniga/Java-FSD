package test;

public class methods {
	
	
	public void print() {
		System.out.println("Method without return type and without parameter");
	}
	public void display(String name) {
		
		System.out.println("My name is "+name);
	}
	public int cube(int n) {
		
		return n*n*n;
	}
	public String fullName(String fname, String lname) {
		return fname+" "+lname;
	}
	int sub(int a, int b) {
		return a-b;
	}
	int sub(int a, int b,int c) {
		return a-b-c;
	}
	float sub(float a, float b) {
		return a-b;
	}
	
	double sub(double a, double b) {
		return a-b;
	}
	
	 
	
	public static void main(String[] args) {
		
		methods obj= new methods();
		obj.print();
		obj.display("Seeyoniga Prince");
		int cube=obj.cube(5);
		System.out.println("Cube of 5 is: "+cube);
		String MyName=obj.fullName("Seeyoniga", "Prince");
		System.out.println("My Name is: "+MyName);
		System.out.println("Difference of 23 and 4 :"+obj.sub(23, 4));
		System.out.println("Difference of 23.0 and 9.78 :"+obj.sub(23.0f,9.78f));
		System.out.println("Difference of 2 double :"+obj.sub(2.3, 6.7));
		System.out.println("Difference of 3 int: "+obj.sub(4, 6, 9));
		
	}

}