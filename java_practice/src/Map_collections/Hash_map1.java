package Map_collections;

import java.util.*;
//does follow alphabetical order
public class Hash_map1 {


		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Map<String,Integer> map=new HashMap<String,Integer>();
			map.put("one",1);
			map.put("two",2);
			map.put("three",3);
			map.put("four",4);
			System.out.println(map);
			map.put("five",5);
			map.put(null,null);
			map.put("five",6);
			System.out.println(map);
			map.replace("four",7);
			System.out.println(map.get("four"));
			System.out.println(map);
			System.out.println(map.keySet());
			System.out.println(map.values());
			System.out.println(map.entrySet());
			System.out.println(map.getOrDefault("nine",7));
		}

	}


