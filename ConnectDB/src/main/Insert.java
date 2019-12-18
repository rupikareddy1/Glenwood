
package main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class Insert {

	public static void main(String[]args) {
        String cnnectionUrl = "jdbc:postgresql://192.168.2.3/interns";
        String user = "glace";
        String pswd = "glacenxt";
        String schoolName = "Hamsavahini";  
        int deptNum = 5;
        int classNum=20;
        PreparedStatement ps=null;
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(cnnectionUrl, user, pswd);
            Statement statement = connection.createStatement();
            String insertData = "insert into tb_school (scl_name,dept_no,clas_no) values (?,?,?)";
             ps = connection.prepareStatement(insertData);
            ps.setString(1, schoolName);
            ps.setInt(2, deptNum);
            ps.setInt(3, classNum);
            ps.executeUpdate();
            statement.close();
            connection.close();
        }
        catch (Exception e) {
            e.printStackTrace();
           
        }
    }



}

