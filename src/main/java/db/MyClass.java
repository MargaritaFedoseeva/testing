package db;

import javafx.scene.chart.PieChart;

import java.security.SecureRandom;
import java.sql.*;


public class MyClass {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        String server = "s-msk-t-ver-db1";
        String port = "5432";
        String database = "testdb";

        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://" + server + ":" + port + "/" + database,
                    "trainee", "123456");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Таблица person");
        Statement stmt = connection.createStatement();

        String strSelect = "select person_code,first_name,last_name,hiredate from person";
        ResultSet rset = stmt.executeQuery(strSelect);

        int rowCount = 0;
        while (rset.next()) { // движение курсора
            String person_code = rset.getString("person_code");
            String first_name = rset.getString("first_name");
            String last_name = rset.getString("last_name");
            String hiredate = rset.getString("hiredate");
            System.out.println(person_code + ":  " + first_name + " " + last_name + " /" + hiredate);
            ++rowCount;
        }
        System.out.println("Таблица purchase");
        String strSelect_2 = "select product_name,salesperson,purchase_date,quantity from purchase";
        ResultSet rset_2 = stmt.executeQuery(strSelect_2);

        Select(rset_2);


        String strInsert = "INSERT INTO purchase (product_name,salesperson,purchase_date,quantity) VALUES ('Small Widget', 'BB', '2018-10-22', 5.00)";
        System.out.println("The SQL query is: " + strInsert); // Echo for debugging
        int countInsert= stmt.executeUpdate(strInsert);

        connection.close();


     //   Select(rset_2);

    }

    private static void Select(ResultSet rset_2) throws SQLException {
        int rowCount_2 = 0;
        while (rset_2.next()) { // движение курсора
            String product_name = rset_2.getString("product_name");
            String salesperson = rset_2.getString("salesperson");
            String purchase_date = rset_2.getString("purchase_date");
            String quantity = rset_2.getString("quantity");
            System.out.println(salesperson + ":  " + product_name + " /" + purchase_date + "/  " + quantity);
            ++rowCount_2;
        }
    }
}