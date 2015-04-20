package loginServlet;
import java.sql.*;
public class Validate {
	 public static boolean checkUser(String email,String password) 
     {
      boolean st =false;
      try{

	 System.out.println("hi");
         Class.forName("oracle.jdbc.driver.OracleDriver");

 	 //creating connection with the database 
         Connection con=DriverManager.getConnection
                        ("jdbc:oracle:thin:@localhost:1521:orcl","hr","Alliswell123");
         PreparedStatement ps =con.prepareStatement
                             ("select email,password from Register where email=? and password=?");
         ps.setString(1, email);
         ps.setString(2, password);
         ResultSet rs =ps.executeQuery();
         while(rs.next()){
        	
        	return true; 
         }
        
      }catch(Exception e)
      {
          e.printStackTrace();
      }
         return st;                 
  }   


}
