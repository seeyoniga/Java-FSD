import java.io.*; 
public class singlylinkedlist{ 
	Node head; 
    static class Node { 
        int data; 
        Node next; 
        Node(int d) { 
        	data = d; 
            next = null; 
        } 
    } 
    	public static singlylinkedlist insert(singlylinkedlist list, int data) 
    	{ 

        		Node new_node = new Node(data); 
        		new_node.next = null; 
        		if (list.head == null) 
{ 
            			list.head = new_node; 
        		} 
        		else 
{ 
            			Node last = list.head; 
            			while (last.next != null) 
{ 
                			last = last.next; 
            			} 
            			last.next = new_node; 
        		} 
        		return list; 
    	} 
   	public static void printList(singlylinkedlist list) 
    	{	 
        		Node currNode = list.head; 
        		System.out.print("LinkedList: "); 
        		while (currNode != null) 
{ 
            			System.out.print(currNode.data + " "); 
            			currNode = currNode.next; 
        		} 
        		System.out.println(); 
    	} 
    	public static singlylinkedlist deleteByKey(singlylinkedlist list, int key) 
    	{ 
    		
        		Node currNode = list.head, prev = null; 
        		if (currNode != null && currNode.data == key) 
{ 
            			list.head = currNode.next; 
            			System.out.println(key + " found and deleted"); 
            			return list; 
        		} 
        		while (currNode != null && currNode.data != key) 
{ 
            			prev = currNode; 
            			currNode = currNode.next; 
        		} 
        		if (currNode != null) 
{ 
            			prev.next = currNode.next; 
            			System.out.println(key + " found and deleted"); 
        		} 
        		if (currNode == null) 
{ 
            			System.out.println(key + " not found"); 
        		} 
        		return list; 
    	} 
    	public static void main(String[] args) 
    	{ 
        		singlylinkedlist list = new singlylinkedlist(); 
        		list = insert(list, 10); 
        		list = insert(list, 20); 
        		list = insert(list, 30); 
        		list = insert(list, 40); 
        		list = insert(list, 50); 
        		list = insert(list, 60); 
        		list = insert(list, 70); 
        		list = insert(list, 80); 
        		printList(list); 
        		deleteByKey(list, 20); 
        		printList(list); 
        		deleteByKey(list, 40); 
        		printList(list); 
        		deleteByKey(list, 12); 
        		printList(list); 
    	} 

}
	