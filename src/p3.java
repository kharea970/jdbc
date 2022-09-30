import java.sql.*;
public class p3 {
    public static void main(String[] args) {
        Connection con = null;
        try{


            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/idfc","root","abc456");
            System.out.println("Connected");
            con.setAutoCommit(false);

            String sql = "insert into student values(10,'amit')";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("record added");

             sql = "insert into student values(11,'vivek')";
             stmt = con.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("record added");

            con.commit();
            con.close();
            System.out.println("disconnected");
        }
        catch(SQLException se){
            System.out.println("issue"+se);
            try{
                con.rollback();
            }catch (SQLException ae){
                System.out.println("rollback error");
            }
            System.out.println("rollback done successfully");
        }
    }
}

