package Map_collections;
import java.util.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//does not allow single null 
//does follow alphabetical ordered 
public class Tree_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Integer> map=new TreeMap<String,Integer>();
		map.put("one",1);
		map.put("two",2);
		map.put("three",3);
		map.put("four",4);
		System.out.println(map);
		map.put("five",5);
		//map.put(null,null);
		map.put("five",6);
		System.out.println(map);
		map.replace("four",7);
		System.out.println(map.get("four"));
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		System.out.println(map.ceilingKey("one"));
		
		System.out.println(map.floorKey("six"));
		System.out.println(map.higherKey("one"));
		System.out.println(map.lowerKey("two"));
		System.out.println(map.getOrDefault("nine",7));
				
				
			
	}

}
