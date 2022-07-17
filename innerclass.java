class outerclass {
  int n1 = 10;

  class innerclass1 {
    int n2 = 2;
  }
}

public class innerclass {
  public static void main(String[] args) {
    outerclass obj = new outerclass();
    outerclass.innerclass1 obj1 = obj.new innerclass1();
    System.out.println(obj1.n2 * obj.n1);
  }
}

