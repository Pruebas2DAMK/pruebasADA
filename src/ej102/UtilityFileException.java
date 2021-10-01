package ej102;

public class UtilityFileException extends Exception{
    //usarla en folder comparator
    UtilityFileException(){
    }
    @Override
    public String getMessage() {
        return super.getMessage()+ " Algo no va bien";
    }
}
