public class Thread1 extends Thread {
    SharedResource sr;
    public Thread1(SharedResource sr){
        this.sr = sr;
    }
    public void run(){
        synchronized (sr.s1){
            System.out.println("Holding lock on resource 1 by" + Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }catch (Exception e) {

            }
            System.out.println("Waiting to hold lock on resource 2 by " + Thread.currentThread().getName());
            synchronized (sr.s2){
                System.out.println("Thread1 holding on lock 2");
            }
        }
    }
}
