package Collection_framework;

import java.util.ArrayDeque;

public class Deque_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> set=new ArrayDeque<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);

		System.out.println(set);
		System.out.println(set.getFirst());
		System.out.println(set.getLast());
		System.out.println(set);
		set.poll();//it removes the head of the Deque element
		System.out.println(set);
		set.poll();
		System.out.println(set);
		set.offerLast(11);
		set.offerFirst(10);
		System.out.println(set);
		System.out.println(set.peek());
		System.out.println(set.poll());
		System.out.println(set);
	}

}
