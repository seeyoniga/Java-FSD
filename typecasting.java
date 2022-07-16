package test;

public class typecasting {
	static void implicit_type_casting(){
		System.out.println("IMPLICIT TYPE CASTING METHOD IS CALLED"); 
		char c = 'd';
		int i = c;
		long l = c;
		float f = c;
		double d = c;
		System.out.println("Character value is :"+c); 
		System.out.println("integer value of character is :"+i); 
		System.out.println("long value of character is :"+l); 
		System.out.println("float value of character is :"+f); 
		System.out.println("double  value of character is :"+d); 
		System.out.println(""); 
	}
	static void explicit_type_casting() {
		System.out.println("EXPLICIT TYPE CASTING METHOD IS CALLED"); 
		int v = 80;
		char c = (char) v;
		double d = 26.2;
		float f = (float) d;
		System.out.println("Integer value is :"+v); 
		System.out.println("character value of integer is :"+c); 
		System.out.println("Double value is :"+d); 
		System.out.println("Float value of double is :"+f); 
		 
	}

	public static void main(String[] args) {
		implicit_type_casting();
		explicit_type_casting();
		

	}

}
