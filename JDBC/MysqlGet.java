import java.sql.*;
public class MysqlGet{
	public static void main(String arg[])
	{
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/mydb",
				"admin", "password");
			Statement statement;
			statement = connection.createStatement();
			ResultSet resultSet;
			resultSet = statement.executeQuery(
				"select * from emp");
			int code;
			String title;
			while (resultSet.next()) {
				code = resultSet.getInt("id");
				title = resultSet.getString("name").trim();
				System.out.println("id: " + code
								+ " name : " + title);
			}
			resultSet.close();
			statement.close();
			connection.close();
		}
		catch (Exception exception) {
			System.out.println(exception);
		}
	} 
} 
