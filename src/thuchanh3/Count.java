package thuchanh3;

public class Count implements Runnable{
    private Thread myThread;

    public Count() {
        myThread = new Thread(this,"my runnable thread");
        System.out.println("my thread creat"+myThread);
    }
    public Thread getMyThread(){
        return myThread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Printing the count"+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");
    }
}
