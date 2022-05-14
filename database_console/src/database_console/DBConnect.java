package database_console;

import java.sql.*;

public class DBConnect {
    public static void main(String[] args) {
        try {
        String host="jdbc:derby://localhost:1527/Database1";
        String uName="prachika";
        String uPass="kanodia";
        Connection con=DriverManager.getConnection(host,uName,uPass);
        
        Statement stmt=con.createStatement();
        String sql="SELECT *FROM Librarymanagement";
        ResultSet rs=stmt.executeQuery(sql);
        while(rs.next()){
        int id_col=rs.getInt("ID");
        String first_name=rs.getString("FIRST_NAME");
        String last_name=rs.getString("LAST_NAME");
        String book=rs.getString("BOOK_NAME");
        
        String p=id_col+" "+first_name+" "+last_name+" "+book;
        System.out.println(p);
        }
        }
        catch(SQLException err){
            System.out.print(err.getMessage());
        }
    }
}
