public class Exercise3 {
    public static void main(String[] args) {
        int [] newArray = new int [499];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i+1;
        }
        for (int odd:newArray) {
            if (odd%2==1) {
                System.out.println(odd);
            }
            if (odd>=340){
                break;
            }
        }
    }
    public static void printOdds(int[] t) {
        for (int u:t){
            if (u%2==1)
            System.out.println(u);
        }
    }
}
