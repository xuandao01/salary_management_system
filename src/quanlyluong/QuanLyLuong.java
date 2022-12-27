package quanlyluong;

import Config.DBConfig;
import View.Login;
import java.sql.DriverManager;
import java.sql.*;
public class QuanLyLuong {

    public static void main(String[] args) {
        Login start = new Login();
        start.setVisible(true);
    }
}
