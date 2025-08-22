package ArrayList;
import java.util.*;
public class stack_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer> s=new Stack<Integer>();
s.push(2);
s.push(1);
s.push(3);
s.push(5);
s.push(4);
s.push(16);
s.push(52);
System.out.println(s);
s.pop();
System.out.println(s);
System.out.println(s.peek());
System.out.println(s.remove(4));
System.out.println(s);
	}

}
