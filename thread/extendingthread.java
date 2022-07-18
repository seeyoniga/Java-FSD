public class extendingthread extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	 public static void main(String[] args) {
 		 extendingthread et = new extendingthread();
 		 et.run();
 	 }
}