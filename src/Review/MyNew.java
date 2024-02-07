package Review;


public class MyNew extends Exception {
    private  String errorMessage;


    public MyNew(String message) {
        super(message);
        this.errorMessage = message;

    }
}
