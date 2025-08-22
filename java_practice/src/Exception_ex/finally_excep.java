package Exception_ex;

public class finally_excep {

	public static void main(String[] args) {
		// TODO Auto-generated method student
		
	        try {
		    int result = 190 / 0;
		} catch (ArithmeticException e) {
		    System.out.println(e);
		}

		try {
		    int[] a = new int[4];
		    System.out.println(a[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
		    System.out.println(e);
		}

		try {
		    String str = null;
		    System.out.println(str.length());
		} catch (NullPointerException e) {
		    System.out.println(e);
		}

		try {
		    String s = "Narasimha";
		    int n = Integer.parseInt(s);
		} catch (NumberFormatException e) {
		    System.out.println(e);
		}
		try {
			
		        checkAge(-5);
        }
		    catch (IllegalArgumentException e) {
            System.out.println(e);
        }

      
        try {
            Object obj = new String("Java");
            Integer i = (Integer) obj;  
        } catch (ClassCastException e) {
            System.out.println(e);
        }
    
        try {
            throw new UnsupportedOperationException("This operation is not supported.");
        } catch (UnsupportedOperationException e) {
            System.out.println(e);
        }

       
        finally {
            System.out.println("Finally");
        }

        System.out.println("End of program.");
    }

    
    static void checkAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
       }
}

}
