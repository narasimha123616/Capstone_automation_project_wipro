package Wrapper_class;

public class wrapper_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//autoboxing
 int num=10;
 System.out.println("primitive"+num);
 Integer num1=num;
 System.out.println("wrap"+num1);
 
 //unboxing
 Integer a=20;
 System.out.println("object"+a);
 int d=a;
 System.out.println("primitive"+d);
 
 String str="35627";
 int ab=Integer.parseInt(str);
 System.out.println(ab);
 
 String n=Integer.toString(num);
 System.out.println(n);
 
 String s="673686abcd";
 
	 
 int charCount = 0;
 int digitCount = 0;
 int specialCount=0;

 for (int i = 0; i < s.length(); i++) {
     Character ch = s.charAt(i); 

     if (Character.isLetter(ch)) {
         charCount++;
     } else if (Character.isDigit(ch)) {
         digitCount++;
     }
     else  
     {
    	 specialCount++;
     }
 }

 System.out.println(charCount);
 System.out.println(digitCount);
 System.out.println(specialCount);
 
	}

}
