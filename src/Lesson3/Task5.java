package Lesson3;

public class Task5 {
    public static void main(String[] args) {
        double [] fifthTaskArray = {12.56, 16.89, 19.99, 27.63, 45.78, 52.13, 77.78, 400.56, 455.123, 467.24, 500.5 };
        double x = 24.12;
        double y = 467.23;
        for (double v : fifthTaskArray) {
            if (v > x && v < y) {
                System.out.print(v + " ");
            }
        }
    }
}
