import java.sql.*;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class ConnectDataSource {


    public static void main(String[] args) {
        Connection dbconn = null;
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String dburl = "jdbc:sqlserver://localhost:1433;DatabaseName=TestDB";
        String username = "sa";
        String password = "134679Aa";
        try {
            Class.forName(driver);
            System.out.println("数据库驱动加载成功");
            dbconn = DriverManager.getConnection(dburl, username, password);
            System.out.println("数据库连接成功");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }catch(SQLException e2) {}



    }
}