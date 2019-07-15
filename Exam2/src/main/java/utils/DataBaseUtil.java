package utils;




import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DataBaseUtil {
    public static Connection getConnection() throws Exception {
        InputStream in = DataBaseUtil.class.getClassLoader().getResourceAsStream("db.properties");
        Properties properties = new Properties();
        properties.load(in);
        String name = properties.getProperty("jdbc.username");
        String password = properties.getProperty("jdbc.password");
        String driver = properties.getProperty("com.mysql.jdbc.Driver");
        String url = properties.getProperty("jdbc.url");
        System.out.println(password);
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, name, password);
        return  connection;
    }

    public static void main(String[] args) throws Exception {
        new DataBaseUtil().getConnection();
    }
}
