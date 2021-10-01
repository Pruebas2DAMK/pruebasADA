package ej102;

import org.junit.jupiter.api.function.Executable;

import java.io.File;
import java.util.*;

public class FolderComparator {
    private File folderA;
    private File folderB;

   public void setFolders (File folderA, File folderB) throws UtilityFileException{

        if ( !folderA.isDirectory() || !folderB.isDirectory()){
            throw new UtilityFileException();
        }
            this.folderA=folderA;
            this.folderB=folderB;
   }

    public File getFolderB() {
        return folderB;
    }

    public File getFolderA() {
        return folderA;
    }

    public boolean compare(){
        Map<String,File> ficherosA = new HashMap<>();
        Map<String,File> ficherosB = new HashMap<>();
        //guarda cada fichero del directorio
        for (File f:folderA.listFiles()
             ) {
            if (!f.isDirectory()){
                ficherosA.put(f.getName(),f);
            }

        }
        for (File f:folderB.listFiles()
        ) {
            if (!f.isDirectory()){
                ficherosB.put(f.getName(),f);
            }

        }
        if (ficherosA.size() != ficherosB.size()){
            return false;
        }
        for (Map.Entry entrada: ficherosA.entrySet()
             ) {
            File fichero = ficherosB.get(entrada.getKey());
            File ficheroActual = (File)entrada.getValue();
            //Segun las pruebas realizadas, la ultima modificacion solo seria util en el caso de que los archivos hayan sido creados en el mismo instante, por ese motivo se queda comentado, aun asi se han ejecutado pruebas y han resultado satisfactorias
            if (fichero == null || fichero.length() != ficheroActual.length() /*|| fichero.lastModified() != ficheroActual.lastModified()*/){
                return false;
            }

        }

       return true;
    }

    public static void main(String[] args) throws UtilityFileException {

        FolderComparator fc = new FolderComparator();
        fc.setFolders(new File("/noexisto"),new File("/home/dam2k/prueba2/"));

        System.out.println(fc.getFolderA().getName());
        System.out.println(fc.getFolderB().getName());
        System.out.println(fc.compare());
    }

}
