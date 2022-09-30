import java.sql.*;
public class p11 {
    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/idfc","root","abc456");
            System.out.println("connected");

            String sql ="{ call p1()}";
            CallableStatement cstmt = con.prepareCall(sql);
            ResultSet rs = cstmt.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString(1));
            }
            con.close();
            System.out.println("disconnected");
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
