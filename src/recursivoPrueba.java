import java.io.File;
/*
Este es de regalo, estoy probando
Joel Sempere Durá
 */
public class recursivoPrueba {

    public static String recursivo(File directorio,String nivel){
        String salida="";
        for (File f:directorio.listFiles()
             ) {
            if (f.isDirectory()){
                salida+=nivel+f.getName()+"\n";
                salida+=recursivo(f,nivel+"  ");
            }else{
                salida+=nivel+f.getName()+"\n";
            }

        }
        return salida;
    }
    public static void main(String[] args) {
        File carpeta = new File("/home/dam2k/");
        System.out.println(recursivo(carpeta, ""));


    }
}
