package JDBC_con;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_con {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "Nara@1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection created");
          //statement created
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("Select * from student");
            System.out.println("student Details");
            while(rs.next())
            {
            	int student_id =rs.getInt("student_id");
            	String name =rs.getString("name");
            	int age= rs.getInt("age");
            	 String course=rs.getString("course");
            	System.out.println("id:"+student_id+"\tname:"+name+"\tage:"+age+"\tcourse"+course);
            }
            con.close();
            stmt.close();
            rs.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
    }
}