import java.sql.*;
public class p5 {
    public static void main(String[] args) {

        try{
//            Class.forName("mysql-connector-java-8.0.30.jar");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/idfc","root","abc456");
            System.out.println("Connected");

            String sql = "select * from student";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                System.out.println("rno = "+ rs.getInt(1)+" name = "+rs.getString(2));
            }
            con.close();
            System.out.println("disconnected");
        }
        catch(SQLException se){
            System.out.println("issue"+se);
        }
    }
}

