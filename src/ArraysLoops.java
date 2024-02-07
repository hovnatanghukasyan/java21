public class ArraysLoops {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 5;
        a[1] = 7;
//        System.out.println(a[0] + a[a.length-1]);

        int[] array = {4, 5, 6, 8, 10, 63, 43};
        int[] e;
        e = new int[]{3, 4, 39, 5, 10};

        int x = -5;
        if (x > 0) {
            System.out.println("positive");
        } else {
            System.out.println("non positive");
        }

        int b;
//        if (x>0)
//            b=1;
//        else
//            b=0;
//        System.out.println(b);

        x = 8;
        if (x > 0) {
            System.out.println("positive");
        } else {
            if (x < 0)
                System.out.println("negative");
            else
                System.out.println("zero");
        }

        System.out.println("___________________");


        switch (x) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("bigger");
        }

        int counter = 1;
        while (counter <= 10) {
            System.out.println(counter++);
        }

        x=1;
        do {
            System.out.println("anything");
            x++;
        }while (x<=4);

        System.out.println("__________________________");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i+ " ");
        }

        String[] names = {"Anna", "Hayk", "Felicia","Abgar"};
        for (int i = 0; i <= names.length-1 ; i++) {
            System.out.println(names[i]);
        }
        System.out.println("__________________");
        for (int i = 0; i < names.length; i++) {
            if (i % 2 == 1)
        System.out.println(names[i]);
        }
        for (String S: names){
            System.out.println(S);
        }
    }
}
