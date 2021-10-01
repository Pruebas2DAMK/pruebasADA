package ej103;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej7JSD {
    public static void main(String[] args) throws IOException {
        File file = new File("./textFile.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una secuencia de caracteres");
        String texto = sc.nextLine();
        if (!file.exists()){
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file,true);
        fw.write(texto+"\n");
        fw.close();
    }
}
