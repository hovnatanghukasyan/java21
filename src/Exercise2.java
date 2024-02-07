public class Exercise2 {
    public static void main(String[] args) {
        char a = '-';
        char b = '|';
        char c = '.';
        char d = 'H';
        char e = 'o';
        char f = 'v';
        char g = ' ';

        System.out.println("" + g + g + g + g + a + g + g + g + g + "\n"
                + g + g + g + c + g + c + g + g + g + "\n"
                + g + g + b + g + b + g + b + g + g + "\n"
                + g + a + g + a + g + a + g + a + g + "\n"
                + a + g + d + g + e + g + f + g + e + g + a + "\n"
                + g + a + g + a + g + a + g + a + g + "\n"
                + g + g + b + g + b + g + b + g + g + "\n"
                + g + g + g + c + g + c + g + g + g + "\n"
                + g + g + g + g + a + g + g + g + g);

        System.out.println(""+g+g+g+g+a+g+g+g+g);
        System.out.println(""+g+g+g+c+g+c+g+g+g);
        System.out.println(""+g+g+b+g+b+g+b+g+g);
        System.out.println(""+g+a+g+a+g+a+g+a+g);
        System.out.println(""+a+g+d+g+e+g+f+g+e+g+a);
        System.out.println(""+g+a+g+a+g+a+g+a+g);
        System.out.println(""+g+g+b+g+b+g+b+g+g);
        System.out.println(""+g+g+g+c+g+c+g+g+g);
        System.out.println(""+g+g+g+g+a+g+g+g+g);

        String firstLine = "      -    ";
        String secondLine = "     . .   ";
        String thirdLine = "    | | |  ";
        String fourthLine = "   - - - - ";
        String name = "-  Hovnatan  -";

        System.out.println(firstLine);
        System.out.println(secondLine);
        System.out.println(thirdLine);
        System.out.println(fourthLine);
        System.out.println(name);
        System.out.println(fourthLine);
        System.out.println(thirdLine);
        System.out.println(secondLine);
        System.out.println(firstLine);
    }

}
