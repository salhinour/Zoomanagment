package tn.esprit.gestionzoo.exeptions;

public class InvalidAgeException extends Exception{


    public InvalidAgeException() {}
    public InvalidAgeException(String message){
        super(message);
    }
}
