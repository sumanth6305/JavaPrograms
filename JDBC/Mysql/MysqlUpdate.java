import java.sql.*;
public class MysqlUpdate{
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
			 String sql = "UPDATE emp1 " +
            "SET name = 'sumanth' WHERE id = 100";
            statement.executeUpdate(sql);
			resultSet = statement.executeQuery(
				"select * from emp1");
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
