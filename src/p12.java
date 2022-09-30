import java.sql.*;
public class p12 {
    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/idfc","root","abc456");
            System.out.println("connected");

            String sql ="{ call p2(?)}";
            CallableStatement cstmt = con.prepareCall(sql);
            cstmt.setString(1,"ashish");
            ResultSet rs = cstmt.executeQuery();

            while(rs.next()){
                System.out.println(rs.getString(1));
            }

            con.close();
            System.out.println("disconnected");
        }catch(SQLException a){
            System.out.println(a);
        }
    }
}

//-- use idfc;
//        -- delimiter $$
//        -- drop procedure if exists p2 $$
//        -- create procedure p2(name varchar(30))
//        -- begin
//        -- 	select upper(name) as RESULT;
//        -- end $$
//        -- delimiter ;
//        call p2("aja");