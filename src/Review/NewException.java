package Review;

public class NewException extends Exception{
    public String error;
    public NewException (String message){
        super(message);
        this.error = message;
    }

}
