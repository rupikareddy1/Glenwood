
package main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class Delete {

	public static void main(String[]args) {
        String cnnectionUrl = "jdbc:postgresql://192.168.2.3/interns";
        String user = "glace";
        String pswd = "glacenxt";
        PreparedStatement ps=null;
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(cnnectionUrl, user, pswd);
            Statement statement = connection.createStatement();
            String deleteData = "Delete from tb_school where clas_no=200 ";
             ps = connection.prepareStatement(deleteData);
 
            ps.executeUpdate();
            statement.close();
            connection.close();
        }
        catch (Exception e) {
            e.printStackTrace();
           
        }
    }



}


