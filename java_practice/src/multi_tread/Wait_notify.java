package multi_tread;
class Simple
{
	void waitforsignals() throws InterruptedException {
		synchronized(this) {
			System.out.println("waiting");
			wait();
			System.out.println("resume");
		}
	}
	
	void givessignal()
	{
		synchronized(this)
		{
			notify();
		}
	}
}
public class Wait_notify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Simple s=new Simple();
Thread t1=new Thread(()->
{
	try {
		s.waitforsignals();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
);
Thread t2=new Thread(()->
{
	try {
		s.givessignal();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
);
t1.start();
t2.start();
	}

}
