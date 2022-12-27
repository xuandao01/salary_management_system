/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author txdao
 */
public class Class {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            System.out.println("hello");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Class.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
