
class shape{
	String sh = "triangle";
	String color = "red";
	String sh1 = "rectangle";
	String color1 = "blue";


void display() {
	System.out.println(color+" "+sh);
	}
void display1() {
	System.out.println(color1+" "+sh1);
	}
}


public class constructor {

public static void main(String[] args) {

	shape shp1=new shape();
	shape shp2=new shape();

	shp1.display();
	shp2.display1();
	}
}
