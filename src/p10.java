import java.sql.*;
public class p10 {
    public static void main(String[] args) {

        try{
//            Class.forName("mysql-connector-java-8.0.30.jar");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/idfc","root","abc456");
            System.out.println("Connected");

            String sql = "drop table student";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("table dropped");


            con.close();
            System.out.println("disconnected");
        }
        catch(SQLException se){
            System.out.println("issue"+se);
        }
    }
}

