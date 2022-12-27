package Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileController {
    public void SaveFile(String fileName, Object obj) throws Exception{
        FileOutputStream fs=new FileOutputStream(fileName);
        ObjectOutputStream os=new ObjectOutputStream(fs);
        os.writeObject(obj);
        fs.close();
        os.close();
    }
    public Object ReadFile(String fileName) throws Exception{
        Object file = null;
        FileInputStream fi = new FileInputStream(fileName);
        ObjectInputStream ob = new ObjectInputStream(fi);
        file = ob.readObject();
        fi.close();
        ob.close();
        return file;
    }
    public boolean CheckFileExist(String fileName){
        File f = new File(fileName);
        if(f.exists()) return true;
        else return false;
    }
}
