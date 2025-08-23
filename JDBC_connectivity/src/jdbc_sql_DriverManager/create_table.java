package jdbc_sql_DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
public class create_table {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "Nara@1234";

        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");

            String sql="CREATE TABLE IF NOT EXISTS employee(rollno int,name varchar(50),per int,email varchar(50))";
            String insertSQL = "INSERT INTO employee (rollno, name, per, email) VALUES (101, 'nara', 89, 'n@ham')";

            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection created successfully!");
Statement stmt=con.createStatement();
stmt.executeUpdate(sql);
System.out.println("employee table created");
int rowInserted=stmt.executeUpdate(insertSQL);
if(rowInserted>0)
{
	System.out.println("new employee record inserted");
}
ResultSet rs=stmt.executeQuery("Select * from employee");
System.out.println("rollno\t name\t per\t email");
while(rs.next())
		{
	int rollno=rs.getInt("rollno");
	String name=rs.getString("name");
	int per=rs.getInt("per");
	String email=rs.getString("email");
	System.out.println("name\t"+name+"rollno\t"+rollno+"per\t"+per+"email\t"+email);
	
		}
           stmt.close();
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }
}
