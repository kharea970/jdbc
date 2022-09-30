import java.sql.*;
public class MyJDBC2 {
    public static void main(String[] args) {

        try{
            //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/idfc","root","abc456");
            System.out.println("Connected");
            con.close();
            System.out.println("disconnected");
        }
        catch(SQLException se){
            System.out.println("issue"+se);
        }
    }
}
