package Ej9;

import java.io.*;

public class Ej9JSD {

    public static void main(String[] args) throws FileNotFoundException {
        String[] titols = {
                "Les tenebres i l'alba",
                "El Quixot de la Mancha",
                "El Senyor del Anells",
                "El petit princep"
        };
        int[] anyoPublicacion = {
                2020,
                1605,
                1954,
                1943
        };
        String ruta = "./BinaryFile.dat";
        try {
                DataOutputStream dos = new DataOutputStream(new FileOutputStream(ruta));
                for (int i = 0; i < titols.length; i++) {
                    dos.writeUTF(titols[i]);
                    dos.writeInt(anyoPublicacion[i]);
                }
                dos.close();

        }catch (Exception e){

        }
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(ruta));
            for (int i = 0; i < titols.length ; i++) {
                System.out.println(dis.readUTF());
                System.out.println(dis.readInt());
            }
            dis.close();
        }catch (Exception e){

        }
    }
}
