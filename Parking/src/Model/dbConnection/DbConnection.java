package Model.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static DbConnection dbConnection=null;
    private Connection connection;

    private DbConnection() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/HotelManagement",
                    "root",
                    "12345");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static DbConnection getInstance() throws ClassNotFoundException {
        if(dbConnection==null){
            dbConnection=new DbConnection();
        }
        return dbConnection;
    }
    public Connection getConnection(){
        return this.connection;
    }
}
