package Ej9;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ej9JSD {

    public static void main(String[] args) {
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(new File("./BinaryFile.dat")));
        }catch (Exception e){

        }
    }
}
