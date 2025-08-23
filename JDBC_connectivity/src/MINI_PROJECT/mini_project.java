package MINI_PROJECT;

import java.sql.*;

public class mini_project {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "Nara@1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            System.out.println(" Connected to MySQL Database\n");
 
            stmt.executeUpdate("DROP TABLE IF EXISTS student");
            String createStudent = "CREATE TABLE student ("
                    + "rollno INT PRIMARY KEY, "
                    + "name VARCHAR(50), "
                    + "percentage DECIMAL(5,2), "
                    + "email VARCHAR(100), "
                    + "city VARCHAR(50))";
            stmt.executeUpdate(createStudent);
            System.out.println("Table 'student' created");

            String insertStudents = "INSERT INTO student VALUES "
                    + "(101, 'Neeva Sharma', 98.5, 'neeva@gmail.com', 'Delhi'),"
                    + "(102, 'Reeva Sharma', 89.0, 'reeva@gmail.com', 'Delhi'),"
                    + "(103, 'Shiva Upadhyay', 92.0, 'shiva@gmail.com', 'Mumbai')";
            stmt.executeUpdate(insertStudents);
            System.out.println("Student records inserted");

            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            System.out.println("\n Student Table:");
            while (rs.next()) {
                System.out.println(rs.getInt("rollno") + "\t" +
                        rs.getString("name") + "\t" +
                        rs.getDouble("percentage") + "\t" +
                        rs.getString("email") + "\t" +
                        rs.getString("city"));
            }

            stmt.executeUpdate("UPDATE student SET percentage = 95.0 WHERE rollno = 102");
            System.out.println("\n Record updated");

            rs = stmt.executeQuery("SELECT * FROM student WHERE percentage = (SELECT MAX(percentage) FROM student)");
            System.out.println("\n Highest Percentage Student:");
            while (rs.next()) {
                System.out.println(rs.getString("name") + " - " + rs.getDouble("percentage"));
            }

            rs = stmt.executeQuery("SELECT * FROM student ORDER BY percentage ASC");
            System.out.println("\n Students in Ascending Order:");
            while (rs.next()) {
                System.out.println(rs.getString("name") + " - " + rs.getDouble("percentage"));
            }

            rs = stmt.executeQuery("SELECT * FROM student WHERE city IN "
                    + "(SELECT city FROM student GROUP BY city HAVING COUNT(*) > 1)");
            System.out.println("\n Students from Same City:");
            while (rs.next()) {
                System.out.println(rs.getString("name") + " - " + rs.getString("city"));
            }

            stmt.executeUpdate("ALTER TABLE student ADD phone VARCHAR(15)");
            System.out.println("\n Column 'phone' added");

            stmt.executeUpdate("ALTER TABLE student MODIFY percentage FLOAT");
            System.out.println(" Column 'percentage' modified to FLOAT");

            stmt.executeUpdate("RENAME TABLE student TO student_data");
            System.out.println(" Table renamed to 'student_data'");

            stmt.executeUpdate("ALTER TABLE student_data DROP COLUMN phone");
            System.out.println(" Column 'phone' deleted");

            stmt.executeUpdate("DELETE FROM student_data WHERE rollno = 103");
            System.out.println(" Deleted student with rollno 103");

            stmt.executeUpdate("DELETE FROM student_data");
            System.out.println(" All records deleted (table structure kept)");

            stmt.executeUpdate("DROP TABLE IF EXISTS student_data");
            System.out.println(" Entire 'student_data' table deleted");

          
            stmt.executeUpdate("CREATE TABLE student (rollno INT PRIMARY KEY, name VARCHAR(50))");
            stmt.executeUpdate("INSERT INTO student VALUES (101, 'Neeva'), (102, 'Reeva'), (103, 'Shiva')");

            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS institute (rollno INT, institute_name VARCHAR(100))");
            stmt.executeUpdate("INSERT INTO institute VALUES "
                    + "(101, 'IIT Delhi'), "
                    + "(102, 'IIT Bombay'), "
                    + "(104, 'IIT Kanpur')");

           
            rs = stmt.executeQuery("SELECT * FROM student s INNER JOIN institute i ON s.rollno = i.rollno");
            System.out.println("\n INNER JOIN (common records):");
            while (rs.next()) {
                System.out.println(rs.getInt("rollno") + "\t" + rs.getString("name") + "\t" + rs.getString("institute_name"));
            }

           
            rs = stmt.executeQuery("SELECT * FROM student s LEFT JOIN institute i ON s.rollno = i.rollno");
            System.out.println("\n⬅️ LEFT JOIN (all student records):");
            while (rs.next()) {
                System.out.println(rs.getInt("rollno") + "\t" + rs.getString("name") + "\t" + rs.getString("institute_name"));
            }

       
            rs = stmt.executeQuery("SELECT * FROM student s RIGHT JOIN institute i ON s.rollno = i.rollno");
            System.out.println("\n RIGHT JOIN (all institute records):");
            while (rs.next()) {
                System.out.println(rs.getInt("rollno") + "\t" + rs.getString("name") + "\t" + rs.getString("institute_name"));
            }

            rs = stmt.executeQuery(
                    "SELECT * FROM student s LEFT JOIN institute i ON s.rollno = i.rollno "
                            + "UNION "
                            + "SELECT * FROM student s RIGHT JOIN institute i ON s.rollno = i.rollno");
            System.out.println("\n FULL OUTER JOIN (all records from both):");
            while (rs.next()) {
                System.out.println(rs.getInt("rollno") + "\t" +
                        rs.getString("name") + "\t" +
                        rs.getString("institute_name"));
            }

           
            stmt.close();
            con.close();
            System.out.println("\n All operations completed successfully.");

        } catch (Exception e) {
            System.out.println(" Error: " + e.getMessage());
        }
    }
}
