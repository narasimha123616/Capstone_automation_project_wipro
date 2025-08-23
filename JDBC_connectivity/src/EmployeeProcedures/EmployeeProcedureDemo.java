package EmployeeProcedures;


import java.sql.*;

public class EmployeeProcedureDemo {
	


	    public static void main(String[] args) {
	        String url = "jdbc:mysql://localhost:3306/mydb";
	        String user = "root";
	        String password = "Nara@1234";  // 🔁 Change to your MySQL password

	        try {
	            // Load driver
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Connect
	            Connection con = DriverManager.getConnection(url, user, password);
	            System.out.println("✅ Connected to database");

	            // === 1. Add Bonus ===
	            CallableStatement cst1 = con.prepareCall("{CALL addBonusToAll()}");
	            cst1.execute();
	            System.out.println("\n✅ Bonus of 5000 added to all employees.");
	            cst1.close();

	            // === 2. Print Employees with Same Name ===
	            CallableStatement cst2 = con.prepareCall("{CALL sameNameEmployees()}");
	            ResultSet rs1 = cst2.executeQuery();

	            System.out.println("\n🔁 Employees with duplicate names:");
	            System.out.println("ID\tName\t\tSalary");
	            while (rs1.next()) {
	                System.out.printf("%d\t%-15s\t%.2f\n",
	                        rs1.getInt("id"),
	                        rs1.getString("name"),
	                        rs1.getDouble("salary"));
	            }
	            rs1.close();
	            cst2.close();

	            // === 3. Print Highest and Lowest Salary ===
	            CallableStatement cst3 = con.prepareCall("{CALL highestLowestSalary()}");
	            ResultSet rs2 = cst3.executeQuery();

	            if (rs2.next()) {
	                System.out.println("\n📊 Salary Summary:");
	                System.out.println("Highest Salary: ₹" + rs2.getDouble("highest_salary"));
	                System.out.println("Lowest Salary : ₹" + rs2.getDouble("lowest_salary"));
	            }
	            rs2.close();
	            cst3.close();

	            // Close connection
	            con.close();
	            System.out.println("\n✅ All procedures executed successfully.");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


