package multi_tread;
class MyThread extends Thread {

    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Thread is running...");
            try {
                Thread.sleep(5000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread has stopped.");
    }

    public void stopRunning() {
    	running=false;
    }



}
public class stop_running {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        try {
            Thread.sleep(30000);  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
t.stopRunning();
    }
}

