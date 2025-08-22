package ArrayList;
import java.util.*;
public class clone_copy {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				LinkedList<String> list=new LinkedList<String>();
				list.add("a");
				list.add("b");
				list.add("c");
				list.add("d");
				System.out.println("Before cloning "+list);
			    LinkedList<String> list1= (LinkedList<String>) list.clone();
				System.out.println("After cloning "+list1);
			}

		}

	


