package Review;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;




public class Main2 {
    public static void main(String[] args) {

        FileReader reader = null;
        try {
            File file = new File(("path"));
            reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
//            reader.close();
        }
        System.out.println("after");



        }


}
