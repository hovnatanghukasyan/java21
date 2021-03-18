public class Task6 {
    public static void main(String[] args) {
        int[] sixthTaskArray = {6, 20, 29, 34, 48, 55, 77, 79};
        int x = 0;
        for (int i = 0; i < sixthTaskArray.length; i++) {
            if (sixthTaskArray [i] % 2 == 0){
                x++;
            }
        }
        System.out.println("Count of numbers = " + x);
    }
}
