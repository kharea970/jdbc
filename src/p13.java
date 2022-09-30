import java.sql.*;
public class p13 {
    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/idfc","root","abc456");
            System.out.println("connected");

            String sql = "call p4(?,?,?)";
            CallableStatement cstmt = con.prepareCall(sql);
            cstmt.setInt(1,1);
            cstmt.setInt(2,2);
            cstmt.registerOutParameter(3,Types.INTEGER);
            cstmt.executeQuery();
            int ans = cstmt.getInt(3);
            System.out.println(ans);

            con.close();
            System.out.println("disconnected");
        }catch(SQLException a){
            System.out.println(a);
        }
    }
}

//-- wamp to accept two integers and add them


