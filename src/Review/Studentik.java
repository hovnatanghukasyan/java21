package Review;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Studentik{


    public static void main(String[] args) {
        Student a = new Student("aaaa", 23);
        Student b = new Student("bbbb", 34);
        Student c = new Student("bbbb", 32);

        List<Student> strings = Arrays.asList(a,b,c);
        Collections.sort(strings);

        System.out.println(strings);

    }


}
