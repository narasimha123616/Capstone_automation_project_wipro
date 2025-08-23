package update_statement;
import java.sql.*;

public class update_Statement {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "Nara@1234";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("Connection created");

        // Clear existing records to avoid primary key conflicts
        Statement stmt = con.createStatement();
        stmt.executeUpdate("DELETE FROM student1");
        System.out.println("Old records deleted");

        // Prepare insert statement
        String query = "INSERT INTO student1(rollno, name, age) VALUES (?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(query);

        // Sample data
        int[] rollnos = {101, 102, 122};
        String[] names = {"nara", "narasimha", "simha"};
        int[] ages = {20, 22, 25};

        for (int i = 0; i < rollnos.length; i++) {
            pst.setInt(1, rollnos[i]);
            pst.setString(2, names[i]);
            pst.setInt(3, ages[i]);
            pst.addBatch();
        }

        int[] rows = pst.executeBatch();
        System.out.println(rows.length + " records inserted successfully.");

        // Display table content
        ResultSet rs = stmt.executeQuery("SELECT * FROM student1");
        System.out.println("\n--- Updated Student Table ---");
        System.out.println("RollNo\tName\t\tAge");
        System.out.println("-------------------------------");

        while (rs.next()) {
            int roll = rs.getInt("rollno");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            System.out.println(roll + "\t" + name + "\t" + age);
        }

        // Close resources
        rs.close();
        pst.close();
        stmt.close();
        con.close();
    }
}
