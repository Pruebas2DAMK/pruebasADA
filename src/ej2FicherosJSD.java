import java.io.File;
import java.util.Arrays;

public class ej2FicherosJSD {
    /*
    Joel Sempere Durá
    Ejercicio2 -
    Crea un programa donde muestres una lista con el nombre de los ficheros del directorio actual.
     */
    public static void main(String[] args) {
        File fl = new File(".");
        System.out.println(Arrays.toString(fl.list()));
    }
}
