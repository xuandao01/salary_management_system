package Controller;

import Model.Account;
import Model.Request;
import java.util.ArrayList;
import java.util.Iterator;

public class AccountController {
    public static ArrayList<Account> dstk = new ArrayList<Account>(){};
    public static ArrayList<Request> listRequest = new ArrayList<Request>(){};
    static String filename = "accounts.txt";
    static String filename2 = "requests.txt";
    static FileController fcontrol = new FileController(){};
    
    static public void create(Account acc){
        try{
            dstk = read();
            acc.setPassword(CaesarCipher.encrypt(acc.getPassword()));
            dstk.add(acc);
            fcontrol.SaveFile(filename, dstk);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    static public ArrayList<Account> read(){
        try{
            if(!fcontrol.CheckFileExist(filename)){
                System.out.println("File not found!");
                return null;
            }
            return (ArrayList<Account>)fcontrol.ReadFile(filename);
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    static public void update(Account acc, String username){
        int a = findByUsername(username);
        try{
            dstk = (ArrayList<Account>)fcontrol.ReadFile(filename);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        if(a!=-1){
            dstk.set(a, acc);
            try{
                fcontrol.SaveFile(filename, dstk);
                System.out.println("Updated");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else {
            System.out.println("can't update");
        }
    }
    static public void delete(String username){
        int a = findByUsername(username);
        if(a!=-1){
            dstk.remove(a);
            try{
                fcontrol.SaveFile(filename, dstk);
                System.out.println("Updated");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            System.out.println("can't remove");
        }
    }
    static public int findByUsername(String username){
        try{
            dstk = (ArrayList<Account>)fcontrol.ReadFile(filename);
            for(int i=0;i<dstk.size();i++){
                if(dstk.get(i).getUsername().compareTo(username) == 0){
                    return i;
                }
            }
            System.out.println("Invalid id!");
            return -1;
        }
        catch (Exception e){
            e.printStackTrace();
            return -1;
        }
    }
    static public void save(){
        try{
            fcontrol.SaveFile(filename, dstk);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    static public void saveRequest(){
        try{
            fcontrol.SaveFile(filename2, listRequest);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void createRequest(Request request){
        listRequest = getAllRequest();
        listRequest.add(request);
        try{
            fcontrol.SaveFile(filename2, listRequest);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static ArrayList<Request> getAllRequest(){
        try{
            return (ArrayList<Request>)fcontrol.ReadFile(filename2);
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public static void deleteRequest(String username){
        try{
            listRequest = getAllRequest();
            for(int i=0;i<listRequest.size();i++){
                if(listRequest.get(i).getUsername().compareTo(username) == 0){
                    listRequest.remove(i);
                }
            }
            saveRequest();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
//        Account acc = new Account("user1", "123456");
//        dstk.add(acc);
//        FileController fi = new FileController();
//        try{
//            fi.SaveFile(filename, dstk);
//        }
//        catch(Exception e){
//            
//        }


//        listRequest = getAllRequest();
//        System.out.println(listRequest.get(0).getUsername());
    }
}
