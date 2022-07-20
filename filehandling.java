import java.io.*;
import java.util.*;

public class filehandling {
	Scanner sc = new Scanner (System.in);
    public static void main(String[] args){
    	
		filehandling obj = new filehandling();
		boolean b= true;
		while(b) {
		System.out.println("ENTER THE NUMBER FOR YOUR FILE HANDLING OPTION 1.CREATE 2.WRITE 3.READ 4.DELETE 5.APPEND "); 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1) {
			obj.createfile();
		}
		else if(n==2) {
			obj.writetofile();
		}
		else if(n==3) {
			obj.readfile();
		}	
		else if(n==4) {
			obj.deletefile();
		}
		else if(n==5) {
			obj.appendtofile();
		}
		else {
			System.out.println("INVALID OPTION");
		}
		System.out.println("Do you want to continue ? Y/N"); 
    	String opt = sc.next();
    	if(opt.equals("Y")||opt.equals("y")) {
    			 b = true;
    	}
    	else {
    			 b = false;
    			 break;
    	}
    }
    }  	
    public void createfile() {
    System.out.println("Enter the file name to be created with extension");	
    String file = sc.nextLine();
    File f = new File(file);

    try {
      if (f.createNewFile()) {
        System.out.println("New File is created.");
      }
      else {
        System.out.println("The file already exists.");
      }
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
    public void  writetofile() {
    System.out.println("Enter the file name you wish to write to");	
    String file = sc.nextLine();
    System.out.println("Enter the data to be written in the file");
    String msg = sc.nextLine();
	try {
		 FileWriter o = new FileWriter(file);
		 o.write(msg);
		 System.out.println("Data is written to the file.");
		 o.close();
	} 
	catch (IOException e) {
		e.printStackTrace();
	}
  }
    public void readfile() {
    	try {
    		System.out.println("Enter the filename you want to read");
    		String r=sc.next();
    		File file = new File(r);
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
    public void appendtofile() {
    	try {
    		System.out.println("Enter the file name you wish to append data to");	
    	    String file = sc.nextLine();
    	    System.out.println("Enter the data to be appended in the file");
    	    String msg = sc.nextLine();
    	    File f = new File(file);
    	    if(!f.exists()) {
    	       f.createNewFile();
    	    }
    	    FileWriter fileWritter = new FileWriter(f.getName(),true);
    	    BufferedWriter bw = new BufferedWriter(fileWritter);
    	    bw.write(msg);
    	    bw.close();
    	    System.out.println("Data appended to the file");
    	 } catch(IOException e){
    	    e.printStackTrace();
    	 }
    }
    public void deletefile() {
    	System.out.println("Enter the filename you want to delete");
		String f=sc.next();
    	File file = new File(f);
    	if (file.delete()) {
            System.out.println("File deleted successfully");
        }
        else {
            System.out.println("Failed to delete the file");
        }
    }
}
