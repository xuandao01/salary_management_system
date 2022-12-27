/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.User;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author txdao
 */
public class UserController {
    public static ArrayList<User> listUser = new ArrayList<User>(){};
    public static DatabaseController db = new DatabaseController();
    public static ArrayList<User> getAllUser(){
        ResultSet rs = db.ConnectToDatabase();
        try {
            while (rs.next()){
                User u = new User();
                u.setId(rs.getInt(1));
                u.setHoTen(rs.getString(2));
                u.setNamSinh(rs.getInt(3));
                u.setQueQuan(rs.getString(4));
                u.setLuongCung(rs.getFloat(5));
                u.setThuong(rs.getFloat(6));
                u.setPhat(rs.getFloat(7));
                u.setUsername(rs.getString(8));
                listUser.add(u);
            }
            return listUser;
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public static void createUser(User user){
        db.Create(user);
    }
    public static void updateUser(User user){
        db.Update(user);
    }
    public static void deleteUser(String username){
        db.Delete(username);
    }
}
