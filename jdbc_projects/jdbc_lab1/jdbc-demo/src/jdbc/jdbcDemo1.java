package jdbc;

import java.sql.*;

/*
This file is for the jdbc demonstration purpose.



 */
public class jdbcDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        // 2.登录驱动
        String url = "jdbc:mysql://localhost:3306/db1?useSSL=false"; // here we use useSSL=false to close the warning message
        String username = "root";
        String password = "1234";

        //3.定义sql
        String sql = "select * from student_id where SEX = 'M'";

        //4. 获取链接对象
        Connection conn = DriverManager.getConnection(url,username, password);
        Statement stmt = conn.createStatement();  // 获取sql的对象并且用stmt进行运行

        //5. 执行sql
        ResultSet rs = stmt.executeQuery(sql);

        //6. 处理结果，遍历数据

        while (rs.next()) {
            String Student_Name = rs.getString("Student_Name");
            Integer Student_ID = rs.getInt("STUDENT_ID");
            String Sex = rs.getString("Sex");

            System.out.println(rs.getString(Student_Name));
            System.out.println(rs.getInt(Student_ID));
            System.out.println(rs.getString(Sex));

        }
//        while () {
//
//
//
//        }

//        int count = 0;
//
//        System.out.println(count);

        rs.close();
        stmt.close();
        conn.close();


    }

}
