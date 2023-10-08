
package employee.management.system;
import java.sql.*;

public class Conn {
    Connection con;
    Statement stmt;
    public Conn()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql:/// employeemanagementsystem","root","ratikantamandal");
            stmt=con.createStatement();
            
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public static void main(String args[])
    {
        
    }
    
}
