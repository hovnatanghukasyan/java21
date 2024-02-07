package Review;

public class Main3 {
    public static void main(String[] args) {

        try {
            System.out.println(divide(12, 1));
            System.out.println(divide2(12, 2));
        }catch (MySecond e){
            System.out.println(e.toString());
        }catch (MyNew e){
            System.out.println(e.toString());
        }
    }
    public static int divide (int a, int b)throws MySecond{
        assert b == 4;
        if (b==1){
            throw new MySecond("impossible");
        }
        return a/b;
    }
    public static int divide2 (int a, int b)throws MyNew{
        if (b==2){
            throw new MyNew("impossible");
        }
        return a/b;
    }
}
