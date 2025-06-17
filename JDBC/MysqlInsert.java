 //Java program to set up connection and get all data from table
import java.sql.*;

public class MysqlInsert{
	public static void main(String arg[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/mydb",
				"admin", "password");
			Statement stmt = connection.createStatement();
            String sql = "INSERT INTO emp1 VALUES (1, 'Sumanth')";
              stmt.executeUpdate(sql);
			  System.out.println("Data inserted...");
		 }
		catch (Exception exception) {
			System.out.println(exception);
		}
	} 
} 