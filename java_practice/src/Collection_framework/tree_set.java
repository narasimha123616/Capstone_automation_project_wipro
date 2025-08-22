package Collection_framework;
import java.util.*;


public class tree_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> set=new TreeSet<String>();
set.add("Nara");
set.add("ascii");
set.add("raamaty");
set.add("aaaaaa");
set.add("si");
set.add("ighjgkklhg");
String a="Nara";
System.out.println(a.hashCode());
String b="ascii";
System.out.println(b.hashCode());
String c="raamaty";
System.out.println(c.hashCode());
String d="si";
System.out.println(d.hashCode());
String e="ighjkklhg";
System.out.println(e.hashCode());
System.out.println(set);
System.out.println(set.clone());
System.out.println(set.contains("N"));
System.out.println(set.isEmpty());
System.out.println(set.getFirst());
System.out.println(set.getLast());

System.out.println(set.ceiling("ert"));
System.out.println(set.floor("ert"));

	}

}



