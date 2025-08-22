package Map_collections;

import java.util.*;

public class Hash_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> map=new HashMap<String,String>();
		map.put("one","hi");
		map.put("two","hii");
		map.put("three","hiii");
		map.put("four","hiiii");
		System.out.println(map);
		map.put("five","hiiiii");
		map.put(null,null);
		map.put("five","hi");
		System.out.println(map);
		map.replace("four","byee");
		System.out.println(map.get("four"));
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		System.out.println(map.getOrDefault("nine","two"));
	}

}
