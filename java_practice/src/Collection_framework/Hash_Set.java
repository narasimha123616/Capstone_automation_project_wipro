package Collection_framework;
import java.util.*;
//unorderd
//No duplicate values are allowed
//store only one null value
//elements stored based on the Hash Code value
public class Hash_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> set=new HashSet<String>();
set.add("N");
set.add("a");
set.add("r");
set.add("a");
set.add("s");
set.add("i");
String a="N";
System.out.println(a.hashCode());
String b="a";
System.out.println(b.hashCode());
String c="r";
System.out.println(c.hashCode());
String d="s";
System.out.println(d.hashCode());
String e="i";
System.out.println(e.hashCode());
set.add(null);
set.add(null);
System.out.println(set);

Iterator<String> itr=set.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
	}

}
