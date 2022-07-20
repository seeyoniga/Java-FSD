import java.io.*;
import java.util.*;

public class createfile {
	Scanner sc = new Scanner (System.in);
    public static void main(String[] args){
    	
    	System.out.println("ENTER THE FILE NAME TO CREATE FILE WITH EXTENSION"); 
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		createfile obj = new createfile();
		File f = new File(s);
		try {
			boolean value = f.createNewFile();
			if (value) {
				System.out.println("New File is created.");
				System.out.println("NAME OF THE CREATED FILE IS : "+s);
			}
			else {
				System.out.println("The file already exists.");
			}
		}
		catch(Exception e) {
			e.getStackTrace();
		}
    }
}
