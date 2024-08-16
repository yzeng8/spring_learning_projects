package druid;


import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

public class DruidDemo {
    public static void main(String[] args) throws Exception {
        //1. 导入jar包

        //2. 配置文件，url，psw，

        //3. 加载配置文件
        System.out.println(System.getProperty("user.dir"));
        Properties prop =  new Properties();
        prop.load(new FileInputStream("jdbc-demo\\src\\druid.properties"));
        // module path: System.getProperty("user.dir")

        //4. 获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);


        Connection conn = dataSource.getConnection();

        System.out.println(conn);
    }
}
