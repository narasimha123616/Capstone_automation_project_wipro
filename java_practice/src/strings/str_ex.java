package strings;

public class str_ex {
 public static void main(String[] args) {
	 String st="Hello";
	 String st1="apple,banana";

	 System.out.println(st.charAt(1));
	 System.out.println(st.codePointAt(1));
	 System.out.println(st.codePointBefore(1));
	 System.out.println(st.codePointCount(0,4));
	 System.out.println(st.equals("Hello"));
	 System.out.println(st.equalsIgnoreCase("hello"));
	 System.out.println(st.isBlank());
	 System.out.println(st.isEmpty());
	 System.out.println(st.lastIndexOf("o"));
	 System.out.println(st.contains("lo"));
	 System.out.println(st.replace("H","J"));
	 System.out.println(st1.split(","));
 }
}
