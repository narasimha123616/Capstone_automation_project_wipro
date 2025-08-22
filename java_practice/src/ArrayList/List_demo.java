package ArrayList;
import java.util.*;
public class List_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List<String> list=new ArrayList<String>();
		list.add(0,"apple");
		list.add(1,"ap");
		list.add(2,"app");
		list.add(3,"appl");
		System.out.println(list);
		System.out.println(list.get(3));
		list.set(1, "kiwi");
		System.out.println(list);
	
		System.out.println(list.contains("apple"));
		System.out.println(list.equals("appla"));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.indexOf("apple"));
		System.out.println(list.isEmpty());
		list.remove(0);
		System.out.println(list);
		list.remove("apple");
		System.out.println(list);
		System.out.println(list.reversed());
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//using list iterator
		Iterator<String> itr1=list.listIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	}

}
