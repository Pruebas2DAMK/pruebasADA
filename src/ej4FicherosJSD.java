import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class ej4FicherosJSD {
    /*
    Joel Sempere Durá
    Ejercicio4 -
    Crea un programa donde utilices los metodos mkdir(), createNewFile() i delete();

     */
    public static void main(String[] args) throws IOException {
        File carpeta = new File("./nuevaCarpeta");
        carpeta.mkdir();
        //Crea una carpeta
        for (int x = 0; x < 2; x++) {
            //da dos vueltas para verificar que funcionan bien los filtros de los if y ver que borra lo que se le pide
            for (int i = 0; i < 8; i++) {
                //crea 8 cosas
                File fl = new File("./"+carpeta.getName()+"/"+i);
                if (!fl.exists()){
                    //si no existe la creo
                    fl.createNewFile();
                    if ( i == 3){
                        //si la i es 3 lo borro
                        fl.delete();
                    }
                }
            }
        }
        for (File f: carpeta.listFiles()
             ) {
            System.out.println("archivo numero: "+f.getName());
        }
        System.out.println("Todo lo que hay en la carpeta: "+Arrays.toString(carpeta.listFiles()));

    }
}
