import java.sql.*;
import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {

        try{
//            Class.forName("mysql-connector-java-8.0.30.jar");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/idfc","root","abc456");
            System.out.println("Connected");

            String sql = "update student set name = ? where rno = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            Scanner sc  = new Scanner(System.in);
            System.out.println("enter rno to update");
            int rno = sc.nextInt();
            System.out.println("enter new name");
            String name = sc.next();
            stmt.setString(1,name);
            stmt.setInt(2,rno);
            long nor= stmt.executeUpdate();
            System.out.println(nor + " records updated ");


            con.close();
            System.out.println("disconnected");
        }
        catch(SQLException se){
            System.out.println("issue"+se);
        }
    }
}

