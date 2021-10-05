package Ej10;

import java.io.*;
import java.util.Date;

public class Ej10JSD {

    static void escribeObjeto(Object b,File f) throws IOException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))){
            oos.writeObject(b);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    static Object leeObjecto(File f){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))){
            return ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        File f = new File ("./BookFile.dat");
        Book nuevo = new Book("Joel Sempere","Mi libro de prueba","Editorial mi prueba",new Date(121,7,28));
        escribeObjeto(nuevo,f);
        System.out.println(leeObjecto(f).toString());
    }

}
