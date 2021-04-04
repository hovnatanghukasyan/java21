import java.util.Scanner;

public class Calculator {
    public static void main(String[] args)
    {
        Scanner value= new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter first number:");
        num1 = value.nextInt();
        System.out.println("Enter second number:");
        num2 = value.nextInt();
        System.out.println("Enter your selection: 1 for Addition, 2 for Subtraction 3 for Multiplication and 4 for Division:");
        int choose;
        choose = value.nextInt();
        switch (choose){
            case 1:
                System.out.println(addition( num1,num2));
                break;
            case 2:
                System.out.println(subtraction( num1,num2));
                break;
            case 3:
                System.out.println(multiplication( num1,num2));
                break;
            case 4:
                System.out.println(division( num1,num2));
                break;
            default:
                System.out.println("Invalid option");
        }
    }
    public static int addition(int x, int y)
    {
        int result = x + y;
        return result;
    }
    public static int subtraction(int x, int y)
    {
        int result = x-y;
        return result;
    }
    public static int multiplication(int x, int y)
    {
        int result = x*y;
        return result;
    }
    public static int division(int x, int y)
    {
        int result = x/y;
        return result;
    }
}

