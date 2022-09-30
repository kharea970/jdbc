import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class P14 {
    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/idfc","root","abc456");
            System.out.println("Connected");


            CallableStatement cstmt = con.prepareCall("{call inserts(?,?)}");
            cstmt.setInt(1,3);
            cstmt.setString(2,"vivek");
            cstmt.execute();

            con.close();
            System.out.println("disconnected");
        }catch(SQLException s){
            System.out.println(s);
        }
    }
}
