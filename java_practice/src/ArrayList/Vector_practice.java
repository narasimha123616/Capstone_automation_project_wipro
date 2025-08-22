package ArrayList;
import java.util.*;
public class Vector_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> list=new Vector<String>();
		list.add(0,"apple");
		list.add(1,"ap");
		list.add(2,"app");
		list.add(3,"appl");
		list.add(null);
		System.out.println(list);
		System.out.println(list.get(3));
		list.set(1, "kiwi");
		System.out.println(list);
		System.out.println(list.subList(0, 3));
		System.out.println(list.remove(1));
		
	}

}
