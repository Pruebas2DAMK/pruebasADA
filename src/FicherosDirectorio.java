import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class FicherosDirectorio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una ruta");
        String salida = sc.nextLine();
        //System.out.println(salida);

        File fl = new File(salida);
        try {
            File []archivos = fl.listFiles();

            //System.out.println(archivos);
            for (File s:archivos
                 ) {
                System.out.println(s.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
