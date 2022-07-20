class myexception extends Exception{
   String s1;
   myexception(String s2) {
	s1=s2;
   }
   public String toString(){ 
	return ("myexception occurred: "+s1) ;
   }
}
class exceptionhandling{
   public static void main(String args[]){
	try{
		System.out.println("TRY BLOCK");
		throw new myexception("THIS IS THE ERROR MESSAGE");
	}
	catch(myexception e){
		System.out.println("CATCH BLOCK") ;
		System.out.println(e) ;
	}
	finally {
		System.out.println("FINAL BLOCK") ;
	}
   }
}
