import java.util.*;  
public class stack{  
	
	static final int maximum = 1000; 
	int top; 
	int arr[] = new int[maximum];  
	boolean isEmpty() 
	{ 
    		return (top < 0); 
	} 
	stack() 
	{ 
    		top = -1; 
	} 

	public static void main(String args[]){  
 
		Stack <Integer> s = new Stack<>();  
		System.out.println("stack: " + s);  
		System.out.println("stack size before pushing elements: " + s.size()); 
		s.push(1);  
		s.push(3);  
		s.push(5);  
		s.push(7);  
		s.push(9);  
		s.push(11);  
		s.push(13); 
		System.out.println("stack: " + s); 
		System.out.println("Stack size before pushing elements: " + s.size()); 
		System.out.println("Top most element of the stack : " + s.peek());  
		s.pop();  
		s.pop();  
		try   
		{  
			s.pop();  
		}   
		catch (EmptyStackException e)   
		{  
			System.out.println("empty stack");  
		}  
	}   
	boolean push(int x){  
		if (top >= (maximum-1)) 
		{ 
    			System.out.println("Stack Overflow"); 
    			return false; 
		} 
		else
		{ 
    			arr[++top] = x; 
    			System.out.println(x + " pushed into stack"); 
    			return true; 
		} 
 
	}  

	int pop()   
	{  
		if (top < 0) 
		{ 
    			System.out.println("Stack Underflow"); 
    			return 0; 
		} 
		else
		{ 
    			int x = arr[top--]; 
    			return x; 
		} 
 
	}  
}  