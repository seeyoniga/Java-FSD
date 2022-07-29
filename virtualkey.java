package phase1final;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class virtualkey {
	Scanner sc = new Scanner (System.in);
    public static void main(String[] args) throws IOException{
    	
		virtualkey obj = new virtualkey();
		System.out.println("APPLICATION DETAILS : VIRTUAL KEY FOR YOUR REPOSITORIES \n"); 
		System.out.println("DEVELOPER DETAILS : SEEYONIGA PRINCE , JAVA FSD \n"); 
		boolean b= true;
		while(b) {
		System.out.println("ENTER YOUR OPTION 1.RETRIEVE FILE IN ASCENDING ORDER 2.BUSINESS OPERATIONS 3.EXIT"); 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1) {
			obj.retrieve();
		}
		else if(n==2) {
			obj.businessopt();
		}
		else if(n==3) {
			System.out.println("closing application..."); 
			break;
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
    			 System.out.println("closing application..."); 
    			 break;
    	}
    }
    } 
    
 public void businessopt() {
	 boolean b= true;
		while(b) {
		System.out.println("ENTER YOUR OPTION 1.CREATE AND WRITE TO FILE 2.DELETE A FILE 3.SEARCH A FILE AND READ ITS CONTENTS 4.EXIT"); 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1) {
			System.out.println("Enter the file name to be created with extension");	
			sc.nextLine();
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
		    System.out.println("Enter the data to be written in the file");
		    String msg = sc.nextLine();
			try {
				 FileWriter o = new FileWriter(file,true);
				 o.write(msg);
				 System.out.println("Data is written to the file.");
				 o.close();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
			 System.out.println("Do you want to continue ? Y/N"); 
		    	String opt = sc.next();
		    	if(opt.equals("Y")||opt.equals("y")) {
		     			 b = true;
		    	}
		    	else {
		     			 b = false;
		     			 System.out.println("quitting business opeartion methods..."); 
		     			 break;
		    	}
		}
		else if(n==2) {
			System.out.println("Enter the filename you want to delete");
			String f=sc.next();
	    	File file = new File(f);
	    	if (file.delete()) {
	            System.out.println("File deleted successfully");
	        }
	        else {
	            System.out.println("File not found");
	        }
	    	System.out.println("Do you want to continue ? Y/N"); 
	    	String opt = sc.next();
	    	if(opt.equals("Y")||opt.equals("y")) {
	     			 b = true;
	    	}
	    	else {
	     			 b = false;
	     			 System.out.println("quitting business opeartion methods..."); 
	     			 break;
	    	}
		}
		else if(n==3) {
			File directory = new File("/Users/seeyo/eclipse-workspace/phase1final/");
	        String[] flist = directory.list();
	        int flag = 0;
	        if (flist == null) {
	            System.out.println("Empty directory.");
	        }
	        else {
	        	System.out.println("Enter the file name to be searched");
	        	String file = sc.next();
	            for (int i = 0; i < flist.length; i++) {
	                String filename = flist[i];
	                if (filename.equalsIgnoreCase(file)) {
	                    System.out.println(filename + " found");
	                    flag = 1;
	                    BufferedReader br = null;
						try {
							br = new BufferedReader(new FileReader(file));
						} catch (FileNotFoundException e1) {
							e1.printStackTrace();
						}
	                    String st;
	                    try {
	        				while ((st = br.readLine()) != null)
	        				    System.out.println(st);
	        			} catch (IOException e) {
	        				e.printStackTrace();
	        			}
	            	} 
	        }
	        if (flag == 0) {
		            System.out.println("File not found");
	    }
	}
	        System.out.println("Do you want to continue ? Y/N"); 
	    	String opt = sc.next();
	    	if(opt.equals("Y")||opt.equals("y")) {
	     			 b = true;
	    	}
	    	else {
	     			 b = false;
	     			 System.out.println("quitting business opeartion methods..."); 
	     			 break;
	    	}
}	
	else if(n==4) {
		System.out.println("quitting business opeartion methods...");
		break;
	}
	else {
			System.out.println("INVALID OPTION");
		}
}
}
 public static void retrieve() {
		File directory = new File("/Users/seeyo/eclipse-workspace/phase1final/");

	    File file[] = directory.listFiles();

	    Arrays.sort(file, (f1, f2) -> f1.compareTo(f2));

	    for (File f : file) {
	       if (!f.isHidden()) {
	          if (f.isDirectory()) {
	          } 
	          else {
	             System.out.println(f.getName());
	          }
	       }
	    }
	}
 }