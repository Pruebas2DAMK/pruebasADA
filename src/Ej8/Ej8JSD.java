package Ej8;

import java.io.*;
import java.util.Scanner;
/*
Joel Sempere Durá -
Ejercicio 7 modificado, añadido el BufferedWriter y BufferedReader
Añadido calculo de tiempo de ejecucion del reader en nanosegundos
 */
public class Ej8JSD {
    public static void main(String[] args) throws IOException {
        File file = new File("./textFile.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una secuencia de caracteres");
        String texto = sc.nextLine();
        if (!file.exists()) {
            file.createNewFile();
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
        bw.write(texto + "\n");
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader(file));
        long tiempoInicio = System.nanoTime();
        while (br.readLine() != null) {
            //System.out.println(br.readLine());
            //solo leerlo para ver la prueba real
        }
        long tiempoFinal = System.nanoTime() - tiempoInicio;
        System.out.println("Tiempo en nanosegundos del bufferedReader "+tiempoFinal); //calculado en nanosegundos



        FileReader fr = new FileReader(file);
        int caracter=0;
        long tiempoInicioFR = System.nanoTime();
        while((caracter = fr.read()) != -1){
            //solo leerlo para ver la prueba real
        }

        long tiempoFinalFR = System.nanoTime() - tiempoInicio;
        System.out.println("Tiempo en nanosegundos del FileReader "+tiempoFinalFR);
    }
}
