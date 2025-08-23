package retrivedata;
import java.sql.*;

public class accessfromdatabase {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "Nara@1234";  // ✅ Replace with your actual password

        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected to database");

            // Prepare to call stored procedure with 2 parameters
            CallableStatement cst = con.prepareCall("{CALL getStudentBymark00(?)}");
            cst.setInt(1, 88);                         // markLimit
           // cst.setString(2, "Neeva sharma");          // studentName

            // Execute stored procedure
            ResultSet rs = cst.executeQuery();

            // Display results
            System.out.println("\nID\tName\t\t\tMarks");
            System.out.println("-----------------------------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");

                System.out.printf("%d\t%-20s\t%d\n", id, name, marks);
            }

            // Close connections
            rs.close();
            cst.close();
            con.close();
            System.out.println("\n✅ Data retrieval complete");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
