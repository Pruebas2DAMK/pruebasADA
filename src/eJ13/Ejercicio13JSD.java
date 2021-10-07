package eJ13;

import java.io.*;
import java.util.Properties;

public class Ejercicio13JSD {
    private String nombre;
    private String email;
    private String idioma;
    private String f;
    final Properties p;

    Ejercicio13JSD() throws IOException {
        this.f ="./app.properties";
        this.p = new Properties();
        p.load(new BufferedReader(new FileReader(f)));
        this.nombre=p.getProperty("userName");
        this.email=p.getProperty("userEmail");
        this.idioma=p.getProperty("language");
    }
    //Metodo que devuelva el nombre del usuario y lo guarde en un atributo para llamarlo sin leer de nuevo el archivo
    public String getNombre() {
        return nombre;
    }
    //Lo mismo pero con el email
    public String getEmail() {
        return email;
    }
    public String getIdioma() {
        return idioma;
    }
    //Metodo que cambie la propiedad idioma del fichero
    public void setIdioma(String idioma) throws IOException {
        p.setProperty("language",idioma);
        this.idioma=idioma;
        p.store(new BufferedWriter(new FileWriter(f)),"Nuevo idioma");
    }

    //Metodo que devuelva todas las keys del fichero
    String devuelveKeys(){
        String salida="";
        for (Object s:p.keySet()
             ) {
            salida+=s.toString()+"\n";
        }
        return salida;
    }
    //Añadir nueva propiedad con clave appStarted y valor es lo introducido en el momento
    void anyadeLinea(String clave, String valor) throws IOException {
        p.setProperty(clave,valor);
        p.store(new BufferedWriter(new FileWriter(f)),"Añadida nueva linea");

    }
    public static void main(String[] args) throws IOException {

        /*
        String archivo="./app.properties";

        BufferedReader br = new BufferedReader(new FileReader(archivo));
        Properties properties = new Properties();
        properties.load(br);
        properties.getProperty("numUsersAllowed", "Default value");
         */
        Ejercicio13JSD nuevo = new Ejercicio13JSD();
        System.out.println(nuevo.devuelveKeys()); //Devuelve claves
        System.out.println(nuevo.getNombre()); // Devuelve nombre valor
        System.out.println(nuevo.getEmail()); // Devuelve email valor
        System.out.println(nuevo.getIdioma()); // Devuelve idioma valor
        nuevo.setIdioma("ES"); //Establece nuevo valor de idioma
        System.out.println(nuevo.getIdioma()); // Devuelve nuevo valor de idioma
        nuevo.anyadeLinea("Localidad","Santa Pola"); //Añadida nueva linea
        System.out.println(nuevo.p.getProperty("Localidad"));
    }
}
