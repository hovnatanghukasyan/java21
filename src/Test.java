public class Test {
    public static void main(String[] args) {
//        boolean isX = false;
//        char [][] chess = new char[8][8];
//
//        for (int i = 0; i < chess.length; i++) {
//            for (int j = 0; j < chess[i].length; j++) {
//                if (isX){
//                    chess [i][j]  = 'x';
//                } else {
//                    chess [i][j] = 'y';
//                }
//                isX = !isX;
//            }
//        }
//        for (int i = 0; i < chess.length; i++) {
//            for (int j = 0; j < chess[i].length; j++) {
//                System.out.print(chess[i][j] + " ");
//            }
//            System.out.println();
//    }
//        System.out.println();
//        Person x = new Person();
//        System.out.println(x.age);
//        System.out.println(x.name);
//        System.out.println(x.isMale);
//        x.age = 12;
//        x.isMale = true;
//        x.name = "Karen";
//        System.out.println(x.age);
//        System.out.println(x.name);
//        System.out.println(x.isMale);
//
//
//        Person Max = new Person();
//        Max.name = "Max";
//        Max.isMale = true;
//        Max.age = 24;
//        Person Tom = new Person();
//        Tom.name = "Tom";
//        Tom.isMale = false;
//        Tom.age = 30;
//
//        Person[] y = {Max, Tom};
//        for (int i = 0; i < y.length; i++) {
//            System.out.println(y[i].isMale);
//            System.out.println(y[i].age);
//            System.out.println(y[i].name);
//        }
//
        class BubbleSort {
            void bubbleSort(int arr[]) {
                int n = arr.length;
                for (int i = 0; i < n - 1; i++)
                    for (int j = 0; j < n - i - 1; j++)
                        if (arr[j] > arr[j + 1]) {
//                             swap arr[j+1] and arr[j]
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
            }
        }
    }
}


