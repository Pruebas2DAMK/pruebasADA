package Ej9;

import java.io.*;

public class Ej9JSD_Metodos {

    static String ruta = "./BinaryFile.dat";
    static String[] titols = {
            "Les tenebres i l'alba",
            "El Quixot de la Mancha",
            "El Senyor del Anells",
            "El petit princep"
    };
    static int[] anyoPublicacion = {
            2020,
            1605,
            1954,
            1943
    };

    static void escribeDos(String[] titulos, int[] anyo) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(ruta));
        for (int i = 0; i < titulos.length; i++) {
            dos.writeUTF(titulos[i]);
            dos.writeInt(anyo[i]);
        }
        dos.close();
    }

    static String leeDis(String path,int cantidadTitulos) throws IOException {
        String salida="";
        DataInputStream dis = new DataInputStream(new FileInputStream(path));
        for (int i = 0; i < cantidadTitulos; i++) {
            salida+=dis.readUTF()+" - ";
            salida+=dis.readInt();
            salida+="\n";
        }
        dis.close();
        return salida;
    }




    public static void main(String[] args) {

        try {
            escribeDos(titols,anyoPublicacion);
        }
        catch (Exception e){
        }

        try {
            System.out.println(leeDis(ruta, 4));
        }catch (Exception e){

        }
    }
}
