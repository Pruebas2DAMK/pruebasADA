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
/*
(año,mes,dia)
Año a partir de 1900, 2021 seria 121
El mes empieza a partir de 0
 */
Date date;
}
