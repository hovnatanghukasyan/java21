package Review;

public class Main4 {
    public static void main(String[] args) {
//        Student s1 = new Student();
//        Student s2 = new Student();
//        s1.setAge(22);
//        s2.setAge(25);
//        swap(s1,s2);
//        System.out.println(s1.getAge());
//        System.out.println(s2.getAge());
//        change(s1);
//        System.out.println(s1.getAge());
//        System.out.println(s2.getAge());

    }
    private static void swap(Student a, Student b){
        Student temp = a;
        a = b;
        b = temp;
    }
    private static void change (Student a){
        a.setAge(100);
//        a = new Student();
        a.setAge(20);
        a.setAge(500);
    }

}
