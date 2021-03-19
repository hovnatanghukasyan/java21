package Lesson3;

public class Task2 {
    public static void main(String[] args) {
        int[] secondTaskArray = new int [1000];
        secondTaskArray [0] = 1;
        for (int i = 0; i < secondTaskArray.length; i++) {
            {
                secondTaskArray [i] = i + 1;
            }
            System.out.println(secondTaskArray[i] + " ");

        }
    }
}
