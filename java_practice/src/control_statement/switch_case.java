package control_statement;

public class switch_case {
	
	    public static void main(String[] args) {
	        String day = "Sat";  // Try changing this value

	        String result;

	        switch (day.toLowerCase()) {
	            case "mon":
	            case "tue":
	            case "wed":
	            case "thu":
	            case "fri":
	            result = (true) ? "Weekday" : "Weekend";
	            	
	                break;
	            case "sat":
	            case "sun":
	           result = (true) ? "Weekend" : "Weekday";
	            
	            	break;
	            default:
	                result = "Invalid day";
	        }

	        System.out.println(day + " is a " + result);
	    }
	}
