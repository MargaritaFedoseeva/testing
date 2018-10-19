package db;

import java.sql.*;
import java.util.List;




public class MyClass {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("org.postgresql.Driver");

        String server="s-msk-t-ver-db1";
        String port="5432";
        String database="testdb";

        Connection connection;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://"+server+":"+port+"/"+database,
                    "trainee","123456");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
