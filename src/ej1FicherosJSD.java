import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

public class ej1FicherosJSD {
    /*
    Joel Sempere Durá
    Ejercicio 1 -
    Escribe un pequeño programa donde muestres el uso de 3 metodos
     */
    public static void main(String[] args) throws URISyntaxException {
        URI uri =new URI("file:/home/dam2k/nuevo.txt");

        File fl = new File("/");
        File fl2 = new File(fl,"/home");
        File fl3 = new File ("/","/bin");
        File fl4 = new File(uri);

        System.out.println(fl.getPath());
        System.out.println(fl2.getName());
        System.out.println(fl3.getName());
        System.out.println(fl4.getName());
    }
}
