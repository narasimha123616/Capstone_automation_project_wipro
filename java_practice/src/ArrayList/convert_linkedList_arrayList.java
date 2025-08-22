package ArrayList;

import java.util.*;

public class convert_linkedList_arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println("Before coverting "+list);
		ArrayList<String> list1=new ArrayList<>(list);
		System.out.println("After coverting "+list1);
	}

}
