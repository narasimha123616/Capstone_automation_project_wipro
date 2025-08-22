package multi_tread;
 class shared{
	 int num;
	 boolean ready=false;
	 synchronized void produce(int n) {
		 if(ready) return;
		 num=n;
		 System.out.println(""+num);
		 ready=true;
		 notify();
	 }
	 
	 synchronized void consume()
	 {
		 while(!ready)
		 {
			 try {wait();}catch(Exception e) {}
			 
		 }
		 System.out.println(""+num);
	 }
	 
 }
public class wait_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
