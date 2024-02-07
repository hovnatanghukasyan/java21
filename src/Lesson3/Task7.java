package Lesson3;

public class Task7 {
    public static void main(String[] args) {
        int[] lastArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int N = 5;
        if (N < 0 || N > 21)
            System.out.println("Out of bounds");
        else {
            System.out.println("input N = " + N);
            System.out.println("Output");
            for (int i = 0; i < lastArray.length; i++) {
                int result = N * lastArray[i];
                System.out.println(N + " x " + lastArray[i] + " = " + result);
            }
        }
    }
}