package ArrayList;
import java.util.*;
public class List_creation {

	public static void main(String[] args) {
		//Add group of elements with list interface method "of"
ArrayList<Integer> list=new ArrayList<>(List.of(10,20,30,40,50));
	//Collections.sort(list);
	System.out.println(list);
	System.out.println(list.contains(30));
	
	}

}
