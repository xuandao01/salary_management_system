
package Config;
public class DBConfig {
    public static final String host = "127.0.0.1";
    public static final int port = 3306;
    public static final String dbUsername = "root";
    public static final String dbName = "qlluong";
    public static final String dbPassword = "root";
    public static final String dataConnect = "jdbc:mysql://"+ host +":"+ port +"/"+dbName;
}
