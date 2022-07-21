public class polymorphism{
    public double area(int x)
    {
        return (3.14*(x*x));
    }
    public int area(int x, int y)
    {
        return (x*y);
    }
    public static void main(String args[])
    {
        polymorphism p = new polymorphism();
        System.out.println(p.area(10));
        System.out.println(p.area(10, 20));
    }
}