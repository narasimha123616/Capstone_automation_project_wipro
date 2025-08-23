package Hospital;


import java.sql.*;

public class HospitalProcedureDemo {
	

	    public static void main(String[] args) {
	        String url = "jdbc:mysql://localhost:3306/mydb"; // Your DB name
	        String user = "root";                             // Your MySQL username
	        String password = "Nara@1234";                    // Your MySQL password

	        try {
	           
	            Class.forName("com.mysql.cj.jdbc.Driver");

	           
	            Connection con = DriverManager.getConnection(url, user, password);
	            System.out.println("✅ Connected to hospital database\n");

	           
	            CallableStatement avgStmt = con.prepareCall("{CALL avgPatientPerDay()}");
	            ResultSet rs1 = avgStmt.executeQuery();

	            System.out.println("📊 Average Patient Count Per Day:");
	            while (rs1.next()) {
	                System.out.println("Average Patients/Day: " + rs1.getDouble("average_patients_per_day"));
	            }
	            rs1.close();
	            avgStmt.close();

	            
	            CallableStatement wardStmt = con.prepareCall("{CALL patientsInSameWard()}");
	            ResultSet rs2 = wardStmt.executeQuery();

	            System.out.println("\n🏥 Patients Belonging to Same Ward:");
	            System.out.println("ID\tName\t\tWard\tAdmission Date");
	            while (rs2.next()) {
	                int id = rs2.getInt("patient_id");
	                String name = rs2.getString("patient_name");
	                int ward = rs2.getInt("ward_no");
	                Date date = rs2.getDate("admission_date");
	                System.out.printf("%d\t%-15s\t%d\t%s\n", id, name, ward, date.toString());
	            }
	            rs2.close();
	            wardStmt.close();

	          	           
	            CallableStatement sortStmt = con.prepareCall("{CALL sortByAdmissionDate()}");
	            ResultSet rs3 = sortStmt.executeQuery();

	            System.out.println("\n📅 Patients Sorted by Admission Date:");
	            System.out.println("ID\tName\t\tWard\tAdmission Date");
	            while (rs3.next()) {
	                int id = rs3.getInt("patient_id");
	                String name = rs3.getString("patient_name");
	                int ward = rs3.getInt("ward_no");
	                Date date = rs3.getDate("admission_date");
	                System.out.printf("%d\t%-15s\t%d\t%s\n", id, name, ward, date.toString());
	            }
	            rs3.close();
	            sortStmt.close();

	            // Close connection
	            con.close();
	            System.out.println("\n✅ All procedures executed successfully.");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


