package ej1022;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
Ejercicio 1.2.2
Joel Sempere Durá
 */
public class Ej6FicherosJSD {

    static String proporcionaInfo(File file) {
        if (file.exists()) {
            File padre = file.getParentFile();
            String salida = "";
            salida += "Nombre: " + file.getName()+"\n";
            salida+= "Ruta: " + file.getPath()+"\n";
            salida+= "Ruta absoluta: "+ file.getAbsolutePath()+"\n";
            salida+= "Nombre del directorio padre: "+padre.getName()+"\n";
            if (file.canWrite() && file.canRead()){
                salida+=file.getName()+" Permite lectura y escritura\n";
            } else {
                salida+=file.getName()+" NO permite lectura y escritura\n";
            }

            return salida;
        }
        return "El argumento no es valido";
    }
    static String creaDirectorios(int cantidad){
        String salida="";
        for (int i=0; i < cantidad; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Ruta del nuevo directorio incluyendo su nombre");
            File file = new File(sc.nextLine());
            file.mkdirs();
            if (file.exists()){
                salida+="Directorio_"+i+" creado con exito: \n";
                salida+=file.getName()+"\n";
                salida+=file.getAbsolutePath()+"\n";
                System.out.println();
            }

        }
        return salida;
    }

    static String creaFicheros(int cantidad) throws IOException {
        String salida="";
        for (int i=0; i < cantidad; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Ruta del nuevo fichero incluyendo su nombre");
            File file = new File(sc.nextLine());
            file.createNewFile();
            if (file.exists()){
                salida+="Fichero_"+i+" creado con exito: \n";
                salida+=file.getName()+"\n";
                salida+=file.getAbsolutePath()+"\n";
                System.out.println();
            }

        }
        return salida;
    }

    static String diferenciasFicheros(File f1,File f2){
        String salida="";
        if (!f1.isDirectory() && !f2.isDirectory()){
            if (f1.getAbsolutePath() != f2.getAbsolutePath()){
                //====================================
                if (f1.getName()!= f2.getName()){
                    salida+="Nombre del fichero 1: "+ f1.getName();
                    salida+="Nombre del fichero2: "+f2.getName();
                }else {
                    salida+="Los ficheros tienen el mismo nombre";
                }
                if (f1.length() != f2.length()){
                    salida=f1.length()>f2.length()?f1.getName()+" es más grande":f2.getName()+" es más grande";
                } else{
                    salida+="Pesan lo mismo";
                }
                //====================================
            } else {
                salida+="Son el mismo fichero";
            }
        }

        return salida;
    }

    static String borraFichero(File file){
        String salida="";



        return salida;
    }


    public static void main(String[] args) {
        //AUN SIN MENU, SOLO PRUEBAS
        System.out.println(proporcionaInfo(new File("/home/dam2k")));
    }
}
