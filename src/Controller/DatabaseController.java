
package Controller;

import Config.DBConfig;
import Model.User;
import com.sun.jdi.connect.spi.*;
import java.beans.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class DatabaseController {
    //Read
    public ResultSet ConnectToDatabase(){
        try{
            java.sql.Connection connect = DriverManager.getConnection(DBConfig.dataConnect, DBConfig.dbUsername, DBConfig.dbPassword);
            PreparedStatement pst = connect.prepareStatement("select * from users");
            ResultSet rs = pst.executeQuery();
            return rs;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public void Create(User user){
        try {
            java.sql.Connection connect = DriverManager.getConnection(DBConfig.dataConnect, DBConfig.dbUsername, DBConfig.dbPassword);
            PreparedStatement pst = connect.prepareStatement("insert into users (id,hoTen,namSinh,"
                                + "queQuan,luongCung,thuong,phat,username) value(?,?,?,?,?,?,?,?)");
            pst.setInt(1, user.getId());
            pst.setString(2, user.getHoTen());
            pst.setInt(3, user.getNamSinh());
            pst.setString(4, user.getQueQuan());
            pst.setFloat(5, user.getLuongCung());
            pst.setFloat(6, user.getThuong());
            pst.setFloat(7, user.getPhat());
            pst.setString(8, user.getUsername());
            pst.executeUpdate();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void Update(User user) {
        try {
            java.sql.Connection connect = DriverManager.getConnection(DBConfig.dataConnect, DBConfig.dbUsername, DBConfig.dbPassword);
            PreparedStatement pst = connect.prepareStatement("update users set hoTen=?, namSinh=?"
                                + ", queQuan=?,luongCung=?, thuong=?, phat=? where username=?");
            pst.setString(1, user.getHoTen());
            pst.setInt(2, user.getNamSinh());
            pst.setString(3, user.getQueQuan());
            pst.setFloat(4, user.getLuongCung());
            pst.setFloat(5, user.getThuong());
            pst.setFloat(6, user.getPhat());
            pst.setString(7, user.getUsername());
            pst.executeUpdate();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void Delete(String username){
        try {
            java.sql.Connection connect = DriverManager.getConnection(DBConfig.dataConnect, DBConfig.dbUsername, DBConfig.dbPassword);
            PreparedStatement pst = connect.prepareStatement("delete from users where username=?");
            pst.setString(1, username);
            pst.execute();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
