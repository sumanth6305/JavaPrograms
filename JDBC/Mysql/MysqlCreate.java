import java.sql.*;
public class MysqlCreate{
	public static void main(String arg[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/mydb",
				"admin", "password");
			Statement stmt = connection.createStatement();
            String sql = "CREATE TABLE emp1 " +
                   "(id INTEGER not NULL, " +
                   " name VARCHAR(255), " + 
                   " PRIMARY KEY ( id ))"; 
         stmt.executeUpdate(sql);
         System.out.println("Created table in given database...");
		 }
		catch (Exception exception) {
			System.out.println(exception);
		}
	} 
} 