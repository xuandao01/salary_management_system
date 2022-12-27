/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

public class CaesarCipher {
    static int a = 14;
    public static String encrypt(String cipher){
        String encrypted = "";
        for(int i=0;i<cipher.length();i++){
            encrypted += (char)(cipher.charAt(i) + a);
        }
        return encrypted;
    }
    public static String decrypt(String cipher){
        String decrypted = "";
        for(int i=0;i<cipher.length();i++){
            decrypted += (char)(cipher.charAt(i) - a);
        }
        return decrypted;
    }
    public static void main(String[] args) {
//        String cipher = "cipher";
//        AccountController.dstk = AccountController.read();
//        for(int i=0;i<AccountController.dstk.size();i++){
//            AccountController.dstk.get(i).setPassword(encrypt(AccountController.dstk.get(i).getPassword()));
//        }
//        FileController fi = new FileController();
//        String filename = "accounts.txt";
//        try{
//            fi.SaveFile(filename, AccountController.dstk);
//        }
//        catch (Exception e){
//            
//        }
//        System.out.println("Done!");
    }
}
