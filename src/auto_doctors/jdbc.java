package auto_doctors;

import java.sql.*;

public class jdbc {
    public Connection connection;
    public Connection getConnection() throws ClassNotFoundException {
        String url ="jdbc:mysql://localhost:3307/auto doctors";
        String username ="root";
        String password = "" ;
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = (Connection)DriverManager.getConnection(url,username,password);
        System.out.println("Connection Successful");
        }
        catch(SQLException e){
            System.out.println("Exception"+" " + e.getMessage());
        }
        return connection;
    }
}
