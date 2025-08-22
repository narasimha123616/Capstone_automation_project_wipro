package multi_tread;
//used syncronized keyword in front of method , gives random execution like one after another
//class Test1 extends Thread {
//    public void run() {
//      for (int i = 1; i <= 5; i++) {
//            System.out.println("welcome");
//            try {
//                Thread.sleep(5);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println("priority"+Thread.currentThread().getId());
//        System.out.println("priority"+Thread.currentThread().getName());
//   Thread.currentThread().setName("hi broo");
//   System.out.println("priority"+Thread.currentThread().getName());
//   System.out.println("priority"+Thread.currentThread().getPriority());
//    }
//}
//
//class Test2 extends Thread {
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Hello");
//            try {
//                Thread.sleep(5);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println("priority"+Thread.currentThread().getId());
//        System.out.println("priority"+Thread.currentThread().getName());
//   Thread.currentThread().setName("hi broo");
//   System.out.println("priority"+Thread.currentThread().getName());
//   System.out.println("priority"+Thread.currentThread().getPriority());
//    }
//}
//
//	
//
//	public class MainThreadExample {
//	    public static void main(String[] args) {
//	        Test1 t1 = new Test1();
//	        Test2 t2 = new Test2();
//
//	        t1.start();
//	        t2.start();
//
//	        try {
//	            t1.join();
//	            t2.join();
//	        } catch (InterruptedException e) {
//	            e.printStackTrace();
//	        }
//
//	        System.out.println("Main thread completed.");
//	    }
//	
//
//	
//
//	}

//	class Test1 extends Thread
//	{
//		public void run()
//		{
//			for(int i=1;i<=5;i++)
//			{
//			System.out.println("Welcome");
//			}
//			System.out.println("Print id for thread="+Thread.currentThread().getId());
//			System.out.println("current name="+Thread.currentThread().getName());
//			Thread.currentThread().setName("Print_welcome_message");
//			System.out.println("New name is="+Thread.currentThread().getName());
//			System.out.println("Priority test1 is="+Thread.currentThread().getPriority());
//			
//			Thread.currentThread().setPriority(10);
//			System.out.println("New Priority for test1 is="+Thread.currentThread().getPriority());
//			System.out.println(Thread.currentThread().isAlive());
//			
//		}
//	}
//	 
//	public class Test extends Thread{
//		public void run()
//		{
//			for(int i=1;i<=5;i++)
//			{
//			System.out.println("Hello ");
//			
//			}
////			System.out.println("Print id for thread="+Thread.currentThread().getId());
////			System.out.println("current name="+Thread.currentThread().getName());
////			Thread.currentThread().setName("Print_Hello_message");
////			System.out.println("New name is="+Thread.currentThread().getName());
//			System.out.println("Priority test is="+Thread.currentThread().getPriority());
//			Thread.currentThread().setPriority(9);
//			System.out.println("New Priority for test is="+Thread.currentThread().getPriority());
//		}
//		
//	 
//		public static void main(String[] args) throws InterruptedException {
//			Test t1=new Test();// creating thread
//			Test1 t2=new Test1();//System.out.println(Thread.currentThread().getName());
//			
//			t1.start();
//			
//			t2.join();
//			
//			t2.start();
//			t1.join();
//	      System.out.println(t1.isAlive());
//	 
//		}
//	 
//	}
	
/*	class Test1 extends Thread {
	    public void run() {
	        for (int i = 1; i <= 5; i++) {
	            System.out.println("welcome");
	             System.out.println(Thread.currentThread().getName());
	                Thread.yeild();
	            }
	        }
	        

	class Test2 extends Thread {
	    public void run() {
	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Hello");
	           
	   System.out.println(Thread.currentThread().getName());
	   Threaad.yeild();
	    }
	}

		

		public class MainThreadExample {
		    public static void main(String[] args) {
		        Test1 t1 = new Test1();
		        Test2 t2 = new Test2();

		        t1.start();
		        t2.start();
	
		    }
		}
	}
	} */
	
	
	
	
