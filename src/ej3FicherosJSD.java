import java.io.File;
import java.util.Arrays;

public class ej3FicherosJSD {
    /*
    Joel Sempere Durá
    Ejercicio 3 -
    Crea un programa utilizando el metodo listFiles() para mostrar la lista de ficheros en un directorio.
    El nombre del directorio  se le pasara al programa y tener en cuenta si el directorio no existe mostrar un mensaje de error.
     */
    public static void main(String[] args) {
        try{
            File fl = new File(args[0]);
            System.out.println(Arrays.toString(fl.listFiles()));
        }catch(Exception e){
            System.out.println("ERROR FATAL");
        }
    }
}
