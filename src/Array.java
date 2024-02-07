public class Array {
    public static void main(String[] args) {
        print ("Arushan", 34, 55, 78, 97);
    }

    public static void print(String name, int... elm) {
        for (int i = 0; i < elm.length; i++) {
            System.out.println(elm[i]);
        }
    }
}
