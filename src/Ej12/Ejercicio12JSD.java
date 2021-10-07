package Ej12;
/*
Joel Sempere Durá -
Ejercicio 12-D
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Ejercicio12JSD {
    public static void main(String[] args) throws IOException {
        String archivo="./archivo.properties";
        BufferedReader br = new BufferedReader(new FileReader(archivo));
        Properties properties = new Properties();
        properties.load(br);
        int valor = Integer.parseInt(properties.getProperty("numUsersAllowed", "Default value"));
        System.out.println(valor);

    }
}
