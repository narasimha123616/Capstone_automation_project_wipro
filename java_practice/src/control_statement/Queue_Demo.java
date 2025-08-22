package control_statement;
import java.util.*;
public class Queue_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue<String> q=new PriorityQueue<String>();
q.add("a");
q.add("b");
q.add("c");
q.add("d");
q.offer("e");
System.out.println(q);
System.out.println(q.peek());
System.out.println(q);
System.out.println(q.poll());
q.remove("c");
System.out.println(q.remove("c"));// there is no method like this just for fun
	}

}
