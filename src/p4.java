import java.sql.*;
import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {

        try{
//            Class.forName("mysql-connector-java-8.0.30.jar");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/idfc","root","abc456");
            System.out.println("Connected");

            String sql = "insert into student values(?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            Scanner sc = new Scanner(System.in);
            System.out.println("enter rno");
            int rno = sc.nextInt();
            System.out.println("enter name");
            String name = sc.next();
            stmt.setInt(1,rno);
            stmt.setString(2,name);
            stmt.executeUpdate();
            System.out.println("record added ");


            con.close();
            System.out.println("disconnected");
        }
        catch(SQLException se){
            System.out.println("issue"+se);
        }
    }
}

