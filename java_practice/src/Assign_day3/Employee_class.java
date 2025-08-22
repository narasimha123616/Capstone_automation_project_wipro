package Assign_day3;

public class Employee_class {
	    String name;
	    int id;

	    static String companyName = "TechCorp";

	    public Employee_class(String empName, int empId) {
	        name = empName;
	        id = empId;
	    }

	 
	    public void displayEmployeeDetails() {
	        
	        String role = "Software Developer";  

	        System.out.println("Employee Name: " + name);       
	        System.out.println("Employee ID: " + id);           
	        System.out.println("Company Name: " + companyName);  
	        System.out.println("Role: " + role);                
	    }

	  
	    public static void main(String[] args) {
	        Employee_class emp1 = new Employee_class("Narasimha", 101);
	        emp1.displayEmployeeDetails();
	    }
	}


