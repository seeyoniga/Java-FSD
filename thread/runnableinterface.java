public class runnableinterface implements Runnable{
 
    public static int myCount = 0;
    public runnableinterface(){
         
    }
    public void run() {
        while(runnableinterface.myCount <= 20){
            try{
                System.out.println("Expl Thread: "+(++runnableinterface.myCount));
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Exception in thread: "+e.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        runnableinterface rt = new runnableinterface();
        Thread t = new Thread(rt);
        t.start();
        while(runnableinterface.myCount <= 20){
            try{
                System.out.println("Main Thread: "+(++runnableinterface.myCount));
                Thread.sleep(200);
            } catch (InterruptedException e){
                System.out.println("Exception in main thread: "+e.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}


