package Review;

import java.util.Arrays;
import java.util.HashSet;

public class Test {
    public static void main(String args[]) {
        //defining an array of type string
        String[] countries = {"Wood apple", "Blackberry", "Blackberry", "Date", "Naseberry", "Tamarind", "Fig",
                "Mulberry", "Apple", "Plum", "Orange", "Custard apple", "Apricot"};
//sorts string array in alphabetical order or ascending order
        Arrays.sort(countries);
//        countries = new HashSet<String>(Arrays.asList(countries)).toArray(new String[0]);
//prints the sorted string array in ascending order
        System.out.println(Arrays.toString(countries));
    }
}