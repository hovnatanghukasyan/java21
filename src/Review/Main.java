package Review;

import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        int [] eee = {12, 332,4};
        try{
        System.out.println(eee[4]);}
        catch (ArrayIndexOutOfBoundsException hov){
            hov.printStackTrace();
            System.out.println("Karen");

        }
    }
}
