import java.io.*;
import java.util.*;

public class updatefile {
	Scanner sc = new Scanner (System.in);
    public static void main(String[] args){
    	Scanner sc = new Scanner (System.in);
		updatefile obj = new updatefile();
		try {
    		System.out.println("Enter the file name you wish to update");	
    	    String file = sc.nextLine();
    	    System.out.println("Enter the data to be updated in the file");
    	    String msg = sc.nextLine();
    	    File f = new File(file);
    	    if(!f.exists()) {
    	    	System.out.println("File does not exist");;
    	    }
    	    FileWriter fileWritter = new FileWriter(f.getName(),false);
    	    BufferedWriter bw = new BufferedWriter(fileWritter);
    	    bw.write(msg);
    	    bw.close();
    	    System.out.println("Data updated in the file");
    	 } catch(IOException e){
    	    e.printStackTrace();
    	 }
    }
}
