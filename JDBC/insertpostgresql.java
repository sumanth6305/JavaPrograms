import java.sql.*;
class insertpostgresql
{
public static void main(String  args[])
{
  String driver="org.postgresql.Driver";
  String url="jdbc:postgresql://localhost:5432/sumanth";
  String user="postgres";
  String pass="password"
  Connection con=null;
  Statement st=null;
  try
  {
	  Class.forName(driver);
	  System.out.println("connecting to database...");
	  con=DriverManager.getConnection(url,user,pass);
	  st=con.createStatement();
	  if(st!=null)
	  {
		  String sqlq="insert into aits1 values('1','sumanth','cse')";
		  st.executeUpdate(sqlq);
		  System.out.println("inserted 1 row sucessfully...");
	  }
	  
  }
  catch(ClassNotFoundException|SQLException e)
  {
	e.printStackTrace();
  }
  finally
  {
	  try
	  {
		con.close();
		st.close();
	  }
	  catch(SQLException a)
	  {
		  a.printStackTrace();
	  }
  }
}
}
