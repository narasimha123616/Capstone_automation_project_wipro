package lamda_package;
import java.util.function.Predicate;
//interface greeting
//{
//	void sayhi();
//}
//public class lamdaExample {
//public static void main (String[] args) {
//	greeting greet =()-> System.out.println("hello hii");
//	greet.sayhi();
//}
//}



//interface Even {
//    boolean iseven(int num);
//}
//
//public class lamdaExample {
//    public static void main(String[] args) {
//        Even check = (num) -> num % 2 == 0;
//        System.out.println(check.iseven(2));  // Output: true
//    }
//}
public class lamdaExample {
    public static void main(String[] args) {
       Predicate<Integer> isEven=num->num%2==0;
        System.out.println(isEven.test(2));  // Output: true
    }
}