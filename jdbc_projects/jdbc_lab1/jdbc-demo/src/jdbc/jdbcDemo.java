package jdbc;

import sun.awt.windows.WPrinterJob;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/*
This file is for the jdbc demonstration purpose.



 */
public class jdbcDemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/db1?useSSL=false"; // here we use useSSL=false to close the warning message
        String username = "root";
        String password = "1234";
        Connection conn = DriverManager.getConnection(url,username, password);
        Statement stmt = conn.createStatement();  // 获取sql的对象并且用stmt进行运行

        int count1 = 0;
        int count2 = 0;

        // start events
        try {
            String sql1 = " update student_id set student_id = 1647132 where student_name = 'tyan' ";
            count1 = stmt.executeUpdate(sql1);

            String sql2 = " update student_id set student_id = 16417130 where student_name = 'Paul Ruiz' ";
            count2 = stmt.executeUpdate(sql2);

            //end events
        } catch (Exception e) {
            // if exception rises roll back events
            throw new RuntimeException(e);
        }

        System.out.println(count1);
        System.out.println(count2);

        stmt.close();
        conn.close();


    }

}
