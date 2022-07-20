interface cat 
{  
    default void animal() 
    { 
        System.out.println("Cat Meows"); 
    } 
}
interface dog 
{  
    default void animal() 
    { 
        System.out.println("Dog Barks"); 
    } 
} 
public class diamondproblem implements dog,cat
{  
    public void animal() 
    {  
    	dog.super.animal();
        cat.super.animal();  
    } 
	public static void main(String args[]) 
    { 
        diamondproblem ob = new diamondproblem(); 
        ob.animal(); 
    } 
}
