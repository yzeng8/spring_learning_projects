package jdbc;

import pojo.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
This file is for the jdbc demonstration purpose.



 */
public class jdbcDemo2 {

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
        List<Student> content = new ArrayList<Student>();

        while (rs.next()) {

            Student std = new Student();
            String Student_Name = rs.getString("Student_Name");
            Integer Student_ID = rs.getInt("STUDENT_ID");
            String Sex = rs.getString("Sex");

            std.setStudent_name(Student_Name);
            std.setStudent_ID(Student_ID);
            std.setSex(Sex);

            content.add(std);
        }

        System.out.println(content);

        // 7.释放资源

        rs.close();
        stmt.close();
        conn.close();


    }

}
