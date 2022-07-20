import java.io.*;
import java.util.*;

public class readfile{
	Scanner sc = new Scanner (System.in);
    public static void main(String[] args){
    	
    	System.out.println("ENTER THE FILE NAME TO READ"); 
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
    	try {
    		File file = new File(s);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            try {
				while ((st = br.readLine()) != null)
				    System.out.println(st);
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    	catch (FileNotFoundException e ) {
    		e.printStackTrace();
    	}
}
}
