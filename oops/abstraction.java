abstract class Shape{  
	abstract void draw();  
}   
class square extends Shape{  
	void draw(){
		System.out.println("square is drawn");}  
}  
class triangle extends Shape{  
	void draw(){
		System.out.println("triangle is drawn");}  
}  
class abstraction{  
	public static void main(String args[]){  
		Shape s=new square();
		s.draw();  
	}  
}  