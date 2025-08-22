package Collection_framework;

import java.util.*;
//add dulpicate elements in queue and deque
//does not allow null value
public class Dqueue_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayDeque<String> set=new ArrayDeque<String>();
	set.add("Nara");
	set.add("ascii");
	set.add("ighjgkklhg");
	set.add("raamaty");
	set.add("aaaaaa");
	set.add("si");
	set.add("ighjgkklhg");
	set.add("si");

	System.out.println(set);
	System.out.println(set.getFirst());
	System.out.println(set.getLast());
	System.out.println(set);
	set.poll();//it removes the head of the Deque element
	System.out.println(set);
	set.poll();
	System.out.println(set);
	set.offerLast("Nara");
	set.offerFirst("si");
	System.out.println(set);
	System.out.println(set.peek());
	System.out.println(set.poll());
	System.out.println(set);
	}

}
