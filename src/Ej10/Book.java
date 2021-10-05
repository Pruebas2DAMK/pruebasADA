package Ej10;

import java.io.Serializable;
import java.util.Date;

/*
Joel Sempere Durá

 */
public class Book implements Serializable {

String author;
String name;
String editorial;
Date date;

    Book(String author,String name,String editorial,Date date){
        this.author=author;
        this.name=name;
        this.editorial=editorial;
        this.date=date;
    }

    public Book(String author, String name, String editorial) {
        this.author = author;
        this.name = name;
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro {" +"\n"+
                "Autor = " + author + "\n" +
                ", Nombre = " + name + "\n" +
                ", Editorial = " + editorial + "\n" +
                ", Date = " + date +
                "\n}";
    }
/*
(año,mes,dia)
Año a partir de 1900, 2021 seria 121
El mes empieza a partir de 0
 */
}
