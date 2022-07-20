import java.io.*;
import java.util.*;

public class deletefile {
	Scanner sc = new Scanner (System.in);
    public static void main(String[] args){
    	
    	System.out.println("ENTER THE FILE NAME TO DELETE"); 
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		deletefile obj = new deletefile();
    	File file = new File(s);
    	if (file.delete()) {
            System.out.println("File deleted successfully");
        }
        else {
            System.out.println("Failed to delete the file");
        }
    }
}
