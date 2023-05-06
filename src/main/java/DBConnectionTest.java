/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author kyawzinthiha
 */
public class DBConnectionTest {

    private static final String JDBC_URL = "jdbc:postgresql://containers-us-west-29.railway.app:6288/railway";
    private static final String USER = "postgres";
    private static final String PASSWORD = "tbluchjTsWXLUz4xAIG9";
    private static final String DRIVER_CLASS = "org.postgresql.Driver";

    public static void main(String[] args) {
        try {
            Class.forName(DRIVER_CLASS);
            Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
            connection.close();
            System.out.println("Database connection successful.");
        } catch (Exception e) {
            System.err.println("Error while connecting to the database:");
            e.printStackTrace();
        }
    }
}
