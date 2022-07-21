import java.util.*;

class area {
  int radius;
  area(int radius) {
    this.radius = radius;
  }
  public void calcarea() {
    int area = radius*radius ;
    System.out.println("Area is: " + area);
  }
}

public class encapsulation {
  public static void main(String[] args) {
	  System.out.println("ENTER THE RADIUS OF THE CIRCLE"); 
	  Scanner sc = new Scanner(System.in);
	  int r = sc.nextInt();
      area circle = new area(r);
      circle.calcarea();
  }
}