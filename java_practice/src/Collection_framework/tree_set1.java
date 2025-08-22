package Collection_framework;

import java.util.*;
public class tree_set1 {
	




		public static void main(String[] args) {
			// TODO Auto-generated method stub
	TreeSet<Integer> set=new TreeSet<Integer>();
	set.add(1);
	set.add(20);
	set.add(31);
	set.add(40);
	set.add(50);
	set.add(60);


	System.out.println(set);
	System.out.println(set.clone());
	System.out.println(set.contains(1));
	System.out.println(set.isEmpty());
	System.out.println(set.getFirst());
	System.out.println(set.getLast());

	System.out.println(set.ceiling(38));//it prints nearest large number or equal
	System.out.println(set.floor(56));//it prints nearest smaller number or equal

		}

	}

